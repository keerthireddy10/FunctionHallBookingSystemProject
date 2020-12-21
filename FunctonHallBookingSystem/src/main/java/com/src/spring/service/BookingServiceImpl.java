package com.src.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.spring.dao.BookingDAO;
import com.src.spring.model.Booking;


	@Service
	public class BookingServiceImpl implements BookingService {
		
		private BookingDAO bookingDAO;

		public void setBookingDAO(BookingDAO bookingDAO) {
			this.bookingDAO = bookingDAO;
		}

		@Override
		@Transactional
		public void addBooking(Booking b) {
			this.bookingDAO.addBooking(b);
		}

		@Override
		@Transactional
		public void updateBooking(Booking b) {
			this.bookingDAO.updateBooking(b);
		}

		@Override
		@Transactional
		public List<Booking> listBookings() {
			return this.bookingDAO.listBookings();
		}

		@Override
		@Transactional
		public Booking getBookingById(int bookingid) {
			return this.bookingDAO.getBookingById(bookingid);
		}

		@Override
		@Transactional
		public void removeBooking(int bookingid) {
			this.bookingDAO.removeBooking(bookingid);
		}

	}


