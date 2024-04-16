package com.restaurant.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Dinner {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String Item;
	   

		public Dinner() {
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getItem() {
			return Item;
		}

		public void setItem(String item) {
			Item = item;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		private String description;
	    
	    private double cost;
	    
	    @OneToMany(mappedBy = "dinner", cascade = CascadeType.ALL)
	    private Set<Booking> bookings;
		public Set<Booking> getBookings() {
			return bookings;
		}

		public Dinner(Long id, String item, String description, double cost, Set<Booking> bookings) {
			super();
			this.id = id;
			Item = item;
			this.description = description;
			this.cost = cost;
			this.bookings = bookings;
		}

		public void setBookings(Set<Booking> bookings) {
			this.bookings = bookings;
		}
	    
	}




