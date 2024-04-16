package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurant.service.impl.Breakserimpl;
import com.restaurant.service.impl.Dinnerimpl;
import com.restaurant.service.impl.Lunchserimpl;

@Controller
public class Booking {
	@Autowired
	private Breakserimpl bser;
	@Autowired
	private Lunchserimpl lser;
	@Autowired
	private Dinnerimpl dser;
	
	
	public Booking() {
		super();
		this.bser = bser;
		this.lser=lser;
		this.dser=dser;
	}
	
	@GetMapping("/ordernow/{id}")
    public String showBookingForm(@PathVariable("id")Long id ,Model model) {
        model.addAttribute("booking",new Booking());
        model.addAttribute("lunch", lser.getLunchById(id));
       return "Lunchmenuorder";
    }
  
	
		  
	}


