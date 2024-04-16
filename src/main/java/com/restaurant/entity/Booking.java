package com.restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	   
	    public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}



		@ManyToOne
	    @JoinColumn(name = "breakfast_id")
	    private Breakfast breakfast;
		@ManyToOne
		@JoinColumn(name = "dinner_id")
		private Dinner dinner;
		@ManyToOne
		@JoinColumn(name = "lunch_id")
		private Lunch lunch;

		
		 public Lunch getLunch() {
			return lunch;
		}


		public void setLunch(Lunch lunch) {
			this.lunch = lunch;
		}


		public Booking(Lunch lunch) {
			super();
			this.lunch = lunch;
		}


		public Booking() {
			super();
		}


		public Booking(Long id, Breakfast breakfast, Dinner dinner,  Customer customer) {
			super();
			this.id = id;
			this.breakfast = breakfast;
			this.dinner = dinner;
			
			this.customer = customer;
		}



		@ManyToOne
		 @JoinColumn(name = "customer_id")
		    private Customer customer;


		public Breakfast getBreakfast() {
			return breakfast;
		}


		public void setBreakfast(Breakfast breakfast) {
			this.breakfast = breakfast;
		}


		public Dinner getDinner() {
			return dinner;
		}


		public void setDinner(Dinner dinner) {
			this.dinner = dinner;
		}



		public Customer getCustomer() {
			return customer;
		}


		public void setCustomer(Customer customer) {
			this.customer = customer;
		}


		    
	}


