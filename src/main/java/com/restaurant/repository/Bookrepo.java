package com.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.entity.Booking;

@Repository
public interface Bookrepo extends JpaRepository <Booking, Long>{

}
