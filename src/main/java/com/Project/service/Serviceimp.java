//package com.Project.service;
//
//public interface Serviceimp {
//
//}
package com.Project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.model.Customers;
import com.Project.repository.MainCustomerRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Serviceimp implements CustomerService{
	
	@Autowired
	private MainCustomerRepo userRepository;

	@Override
	public boolean addUser(Customers user) {
		Optional<Customers> isExists = userRepository.findByEmail(user.getEmail());
		if (isExists.isPresent()) {
			return false;
		} else {
			userRepository.save(user);
			return true;
		}
	}
	@Override
	public boolean getUser(Customers user) {
		Optional<Customers> isExists =userRepository.existsByUsername(user.getUsername());
		if (isExists.isPresent()) {
			return true;
		} else {
             return false;
		}
	}
}