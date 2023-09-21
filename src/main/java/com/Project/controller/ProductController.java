package com.Project.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.model.Products;
import com.Project.service.ProductService;



@RestController
@CrossOrigin
public class ProductController {
	
   @Autowired
	private ProductService S;
	
	
	@PostMapping("/post")
	public ResponseEntity<String> addUser(@RequestBody Products user){
		boolean isDataAdded = S.addUser(user);
		if (isDataAdded) {
			return ResponseEntity.status(200).body("User added successfully!");
		} else {
			return ResponseEntity.status(404).body("Something went wrong!");
		}
	}
	@GetMapping("/get")
	public List<Products> getList(){
		return S.getDetails();
	}
	
	@GetMapping("/get1/{id}")
	public Optional<Products> getobjectById(@PathVariable int id){
		return S.getObject(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteprod(@PathVariable int id) {
		S.deleteProd(id);
	}
	
	@PutMapping("update/{id}")
	public String updatebyid(@RequestBody Products aa, @PathVariable int id) {
		Optional<Products> temp = S.getObject(id);
		if(temp.isPresent()) {
			S.update(id,aa);
			return "Object updated successfully!";
		}
		return "Enter a valid id!";
	}
}
