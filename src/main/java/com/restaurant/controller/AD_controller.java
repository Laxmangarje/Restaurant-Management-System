package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.restaurant.entity.Breakfast;
import com.restaurant.entity.Dinner;
import com.restaurant.entity.Lunch;
import com.restaurant.service.impl.Breakserimpl;
import com.restaurant.service.impl.Dinnerimpl;
import com.restaurant.service.impl.Lunchserimpl;

@Controller
public class AD_controller {
	@Autowired
	private Breakserimpl bser;
	@Autowired
	private Lunchserimpl lser;
	@Autowired
	private Dinnerimpl dser;
	
	
	public AD_controller(Breakserimpl bser,Lunchserimpl lser,Dinnerimpl dser) {
		super();
		this.bser = bser;
		this.lser=lser;
		this.dser=dser;
	}

	@GetMapping("/AddLogin")
	public String Addlogin() {
		return "Admindash";
		
	}
	
	@GetMapping("/Addbreakfast")
	public String Addbreakfast(Model model) {
		Breakfast bf= new Breakfast();
		model.addAttribute("breakfast",bf);
		return "Breakfast";
		
	}
	@PostMapping("/saveBreakfast")
	public String SaveBreakfast(@ModelAttribute("breakfast") Breakfast breakfast) {
		bser.SaveHotel(breakfast);
		return "Admindash";
		
		
	}
	@RequestMapping("/getAllbreakfast")
	   public String GetAllhotel(Model model) {
		   java.util.List <Breakfast> breakfast=bser.GetAllBreak();
		   model.addAttribute("breakfast", breakfast);
		return "Adbreakfast";
		   
	   }

	@GetMapping("/getAlllunch")
	public String Addlunch(Model model) {
		Lunch lc=new Lunch();
		model.addAttribute("lunch",lc);
		return "Lunch";
		
	}
	
	@PostMapping("/savelunch")
	public String Savelunch(@ModelAttribute("lunch") Lunch lunch) {
		lser.SaveLunch(lunch);
		return "Admindash";
		
		
	}
	@RequestMapping("/getadedAlllunch")
	   public String GetAlllunch(Model model) {
		   java.util.List <Lunch>lunch=lser.GetAlllunch();
		   model.addAttribute("lunch", lunch);
		  return "Adlunch";
		   
	   }
	
	
		@GetMapping("/Adddinner")
		public String Adddinner(Model model) {
			Dinner dn=new Dinner();
			model.addAttribute("dinner",dn);
			return "Dinner";
			
		}
		@PostMapping("/savedinner")
		public String SaveDinner(@ModelAttribute("dinner") Dinner dinner) {
			dser.SaveDinner(dinner);
			
			return "Admindash";
			
			
		}
		@RequestMapping("/getadedAlldinner")
		   public String GetAlldinner(Model model) {
			   java.util.List <Dinner>dinner=dser.GetAllDinner();
			   model.addAttribute("dinner", dinner);
			  return "Addinner";
			   
		   }
		
		@RequestMapping("/getpopularbreakfast")
		   public String GetAlldinners(Model model) {
			   java.util.List <Breakfast>breakfast=bser.GetAllBreak();
			   model.addAttribute("breakfast", breakfast);
			  return "Userbreakfastmenu";
			   
		   }
		
		@RequestMapping("/getpopulardinner")
		   public String GetAllldinners(Model model) {
			   java.util.List <Dinner>dinner=dser.GetAllDinner();
			   model.addAttribute("dinner", dinner);
			  return "Dinnermenu";
	
		   }
		@RequestMapping("/getpopularlunch")
		   public String GetAllllunchs(Model model) {
			   java.util.List <Lunch>lunch=lser.GetAlllunch();
			   model.addAttribute("lunch", lunch);
			  return "Lunchmenu";
	
		   }
		
	

}
