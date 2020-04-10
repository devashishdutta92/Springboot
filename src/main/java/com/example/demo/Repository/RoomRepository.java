package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.RoomReservation;;

public interface RoomRepository extends JpaRepository<RoomReservation, String>{
	
	

}
