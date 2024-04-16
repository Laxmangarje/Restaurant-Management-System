package com.restaurant.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.controller.Booking;
import com.restaurant.entity.Lunch;
import com.restaurant.repository.Lunchrepo;
import com.restaurant.service.Lunchser;

@Service
public class Lunchserimpl implements Lunchser {
	private Lunchrepo lrepo;

	public Lunchserimpl(Lunchrepo lrepo) {
		super();
		this.lrepo = lrepo;
	}

	@Override
	public Lunch SaveLunch(Lunch lunch){
		
		return lrepo.save(lunch);
	}

	@Override
	public List<Lunch> GetAlllunch() {
		
		  return lrepo.findAll();
	}

	@Override
	public Lunch getLunchById(Long id) {
		// TODO Auto-generated method stub
		return lrepo.getById(id);
	}

	
	

	
}
