package com.restaurant.service.impl;

import org.springframework.stereotype.Service;

import com.restaurant.entity.Booking;
import com.restaurant.repository.Bookrepo;
import com.restaurant.service.Bookser;
@Service
public class Bookingserimpl implements Bookser {
  private Bookrepo brepo;
	public Bookingserimpl(Bookrepo brepo) {
	super();
	this.brepo = brepo;
}

	@Override
	public void saveBooking(Booking booking) {
		brepo.save(booking);
		
	}

	@Override
	public void deleteBooking(Long id) {
		brepo.deleteById(id);
		
	}

	@Override
	public Booking getBookingById(Long id) {
		// TODO Auto-generated method stub
		return brepo.getById(id);
	}

}
