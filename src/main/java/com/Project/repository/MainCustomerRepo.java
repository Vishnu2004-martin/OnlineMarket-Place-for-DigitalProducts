//package com.Project.repository;
//
//
//
//
//
//
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//
//import com.Project.model.Customers;
//
//
//public interface MainCustomerRepo extends JpaRepository<Customers, Integer> {
//
//	void save(int cusid);
//
//	void deleteById(int cusid);
//
//	
//
//	
//
//	
//
//
//
//	
//
//	
//
//
//
//}
package com.Project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.model.Customers;



public interface MainCustomerRepo extends JpaRepository<Customers, Long>{

	Optional<Customers> findByEmail(String email);
	Optional<Customers> existsByUsername(String username);

}