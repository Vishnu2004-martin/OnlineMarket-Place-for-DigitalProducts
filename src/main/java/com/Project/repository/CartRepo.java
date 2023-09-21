package com.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
