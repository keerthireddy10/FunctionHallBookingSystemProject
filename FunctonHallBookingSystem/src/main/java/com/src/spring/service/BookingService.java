package com.src.spring.service;

import java.util.List;

import com.src.spring.model.Booking;

public interface BookingService {

	public void addBooking(Booking b);
	public void updateBooking(Booking b);
	public List<Booking> listBookings();
	public Booking getBookingById(int bookingid);
	public void removeBooking(int bookingid);
}
