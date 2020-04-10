package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.RoomReservation;
import com.example.demo.Repository.RoomRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class RoomController {
	
	@Autowired
	RoomRepository roomRepository;
	
	@PostMapping("/booking")
    public ResponseEntity<RoomReservation> createUser(@RequestBody RoomReservation room) {
      try {
      	RoomReservation roomDetails = roomRepository
            .save(new RoomReservation(room.getFullname(), room.getEmail(), room.getTravellers(),room.getFromDate(),room.getToDate(),room.getMobile(),room.getAddress()));
      
        return new ResponseEntity<>(roomDetails, HttpStatus.CREATED);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
      }
    }

}
