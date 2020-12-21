package com.src.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.src.spring.model.Booking;
import com.src.spring.dao.BookingDAO;
@Repository
public class BookingDAOImpl  implements BookingDAO {
		
		private static final Logger logger = LoggerFactory.getLogger(BookingDAOImpl.class);

		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}

		@Override
		public void addBooking(Booking b) {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(b);
			logger.info("Booking saved successfully, Booking Details="+b);
		}

		@Override
		public void updateBooking(Booking b) {
			Session session = this.sessionFactory.getCurrentSession();
			session.update(b);
			logger.info("Booking updated successfully, Booking Details="+b);
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Booking> listBookings() {
			Session session = this.sessionFactory.getCurrentSession();
			List<Booking> bookingList = session.createQuery("from Booking").list();
			for(Booking b : bookingList){
				logger.info("Booking List::"+b);
			}
			return bookingList;
		}

		@Override
		public Booking getBookingById(int bookingid) {
			Session session = this.sessionFactory.getCurrentSession();		
			Booking b = (Booking) session.load(Booking.class, new Integer(bookingid));
			logger.info("Booking loaded successfully, Booking details="+b);
			return b;
		}
		@Override
		public void removeBooking(int bookingid) {
			Session session = this.sessionFactory.getCurrentSession();
			Booking b = (Booking) session.load(Booking.class, new Integer(bookingid));
			if(null != b){
				session.delete(b);
			}
			logger.info("Booking deleted successfully, Booking details="+b);
		}
}
