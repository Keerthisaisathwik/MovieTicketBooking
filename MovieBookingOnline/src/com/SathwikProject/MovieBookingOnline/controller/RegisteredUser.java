package com.SathwikProject.MovieBookingOnline.controller;

import java.util.ArrayList;

public class RegisteredUser extends User{
	
	public ArrayList<Ticket> bookingHistory;

	public RegisteredUser(int id, String name) {
		super(id, name);
		this.bookingHistory = new ArrayList<>();
	}
	
	public void cancelTicket(Ticket ticket){

    }

}
