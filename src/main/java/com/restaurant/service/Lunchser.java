package com.restaurant.service;

import java.util.List;


import com.restaurant.entity.Lunch;

public interface Lunchser {
	Lunch SaveLunch( Lunch lunch);
	 List<Lunch>GetAlllunch();
	 public Lunch getLunchById(Long id);
}