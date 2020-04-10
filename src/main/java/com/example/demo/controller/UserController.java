package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
//import com.example.service.UserService;
import com.example.demo.Repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	  UserRepository userRepository;
//    private UserService userService;

    
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
      try {
      	User _user = userRepository
            .save(new User(user.getUsername(), user.getEmail(), user.getPassword(),user.getMobile()));
      
        return new ResponseEntity<>(_user, HttpStatus.CREATED);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
      }
    }
    
   
	
    @GetMapping("/user")
    public ResponseEntity<User> getUserByUsername(@RequestParam(required = false) String username) {
      List<User>userData = userRepository.findByUsername(username);
    
      if (userData.isEmpty()) {
        return new ResponseEntity<>( HttpStatus.NOT_FOUND);
      } else {
        return new ResponseEntity<>(HttpStatus.OK);
      }
    }
    
	
}