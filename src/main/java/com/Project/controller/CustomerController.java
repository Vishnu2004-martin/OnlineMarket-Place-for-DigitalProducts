//package com.Project.controller;

//
//
//
//import java.util.Optional;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.Project.model.Customers;
//
//import com.Project.service.CustomerService;
//
//import io.swagger.v3.oas.annotations.tags.Tag;
//
//
//
//@RestController
//@RequestMapping("/api/v1/customer")
//@CrossOrigin("*")
//@Tag(name="user")
// 
//public class CustomerController {
//	@Autowired
//	 CustomerService ser;
//
//	
//	@PostMapping("/addcustomer")
//	public String addcustomer(@RequestBody Customers cu) {
//		ser.saveinfo(cu);
//		return("Added sucessfully");
//	}
//	@GetMapping("/getcustomer/{cusid}")
//	public Optional<Customers> getcustomer( @PathVariable int cusid, @RequestBody Customers cu) {
//		return ser.show(cusid);
//	}
//	 
//   @PutMapping("/update/{cusid}")
//   public String updateuser(@PathVariable int cusid,@RequestBody Customers cu) {
//	   ser.save(cu);
//	   return ("Updated");
//   }
//   @DeleteMapping("/delete/{cusid}")
//   public String deleteuser(@PathVariable int cusid,@RequestBody Customers cu) {
//	   ser.deleteByid(cu);
//	   return("deleted");
//   }
//    
//   
//	
//
//}

package com.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.model.Customers;
import com.Project.service.CustomerService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin("*")
@Tag(name = "user")
public class CustomerController {
	
	@Autowired
	private CustomerService Service;
	
	@PostMapping("/signup")
	public ResponseEntity<String> addUser(@RequestBody Customers user){
		boolean isDataAdded = Service.addUser(user);
		if (isDataAdded) {
			return ResponseEntity.status(200).body("User added successfully!");
		} else {
			return ResponseEntity.status(404).body("Something went wrong!");
		}
	}
	
	@PostMapping("/login") 
	public ResponseEntity<String>getUser(@RequestBody Customers user){
		boolean isDataGet=Service.getUser(user);
		if(isDataGet) {
			return ResponseEntity.status(200).body("Logged in successfully!");
		}else {
			return ResponseEntity.status(404).body("User not found!");
		}
	}
}