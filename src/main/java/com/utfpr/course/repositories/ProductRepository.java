package com.utfpr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utfpr.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}