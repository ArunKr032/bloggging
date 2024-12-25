package com.nontech.blogapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontech.blogapis.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
