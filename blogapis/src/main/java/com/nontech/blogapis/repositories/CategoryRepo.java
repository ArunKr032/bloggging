package com.nontech.blogapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontech.blogapis.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
