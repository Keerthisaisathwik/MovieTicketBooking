package com.SathwikProject.MovieBookingOnline.controller;

import java.util.Date;

public class Ticket {

	private int id;
	private Date bookingTime;
	private String theater;
	private int noOfSeats;
	
	private Show bookedShow;
	
	public Ticket(int id, Date bookingTime, String theater, int noOfSeats, Show bookedShow) {
		super();
		this.id = id;
		this.bookingTime = bookingTime;
		this.theater = theater;
		this.noOfSeats = noOfSeats;
		this.bookedShow = bookedShow;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public Show getBookedShow() {
		return bookedShow;
	}
	public void setBookedShow(Show bookedShow) {
		this.bookedShow = bookedShow;
	}
	
	
}
