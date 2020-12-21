package com.src.spring.dao;

import java.util.List;

import com.src.spring.model.Booking;

public interface BookingDAO {
	
	public void addBooking(Booking b);
	public void updateBooking(Booking b);
	public List<Booking> listBookings();
	public Booking getBookingById(int bookingid);
	public void removeBooking(int bookingid);
}
