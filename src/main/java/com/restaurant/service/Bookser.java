package com.restaurant.service;

import com.restaurant.entity.Booking;

public interface Bookser {
	
	 public void saveBooking(Booking booking);
	 public void deleteBooking(Long id);
	 public Booking getBookingById(Long id);
	 

}
