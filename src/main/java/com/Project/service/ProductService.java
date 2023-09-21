package com.Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.model.Customers;
import com.Project.model.Products;
import com.Project.repository.MainCustomerRepo;
import com.Project.repository.ProductsRepo;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService{
	
	@Autowired
	private ProductsRepo userRepository;

	public boolean addUser(Products user) {
		userRepository.save(user);
		return true;
	}
    public List<Products> getDetails(){
    	return userRepository.findAll();
    }
    public Optional<Products> getObject(int id){
    	return userRepository.findById(id);
    }
    public void deleteProd(int id) {
    	userRepository.deleteprod(id);
    }
    public Products update(int id,Products a) {
		Products existingEntity = userRepository.findById(id).orElse(null);
		if(existingEntity != null) {
			existingEntity.setProdname(a.getProdname());
			existingEntity.setProddec(a.getProddec());
			existingEntity.setProdprice(a.getProdprice());
			
			return userRepository.save(existingEntity);
		}
		else {
			throw new EntityNotFoundException("Row not found with id: ");
		}
	}
}