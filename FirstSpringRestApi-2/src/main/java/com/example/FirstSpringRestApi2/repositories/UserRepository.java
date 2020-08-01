package com.example.FirstSpringRestApi2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FirstSpringRestApi2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
