package com.utfpr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utfpr.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}