package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Model.User;

public interface UserRepository extends JpaRepository<User, String> {
//    User findByUsername(String username);
    List<User> findByUsername(String username);
	
}