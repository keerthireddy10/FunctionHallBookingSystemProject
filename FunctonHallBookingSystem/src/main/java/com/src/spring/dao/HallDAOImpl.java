package com.src.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.src.spring.model.Hall;

@Repository
public class HallDAOImpl implements HallDAO{

	private static final Logger logger = LoggerFactory.getLogger(BookingDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public void addHall(Hall h) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(h);
		logger.info("Hall saved successfully, Hall Details="+h);
	}

	@Override
	public void updateHall(Hall h) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(h);
		logger.info("Booking updated successfully, Booking Details="+h);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hall> listHalls() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Hall> hallList = session.createQuery("from Hall").list();
		for(Hall h : hallList){
			logger.info("Hall List::"+h);
		}
		return hallList;
	}

	@Override
	public Hall getHallById(int hallid) {
		Session session = this.sessionFactory.getCurrentSession();		
		Hall h = (Hall) session.load(Hall.class, new Integer(hallid));
		logger.info("hall loaded successfully, Booking details="+h);
		return h;
	}
	@Override
	public void removeHall(int hallid) {
		Session session = this.sessionFactory.getCurrentSession();
		Hall h = (Hall) session.load(Hall.class, new Integer(hallid));
		if(null != h){
			session.delete(h);
		}
		logger.info("hall deleted successfully, Hall details="+h);
	}
}
