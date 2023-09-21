package com.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Project.model.Products;

import jakarta.transaction.Transactional;

public interface ProductsRepo extends JpaRepository<Products,Integer> {
	
	
	@Modifying
	@Transactional
	@Query(value="delete from product where prodid=:s",nativeQuery = true)
	public void deleteprod(@Param("s") int Products);
}
