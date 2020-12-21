package com.src.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.src.spring.dao.HallDAO;
import com.src.spring.model.Hall;

@Service
public class HallServiceImpl implements HallService{

	private HallDAO hallDAO;

	public void setHallDAO(HallDAO hallDAO) {
		this.hallDAO = hallDAO;
	}

	@Override
	@Transactional
	public void addHall(Hall h) {
		this.hallDAO.addHall(h);
	}

	@Override
	@Transactional
	public void updateHall(Hall h) {
		this.hallDAO.updateHall(h);
	}

	@Override
	@Transactional
	public List<Hall> listHalls() {
		return this.hallDAO.listHalls();
	}

	@Override
	@Transactional
	public Hall getHallById(int hallid) {
		return this.hallDAO.getHallById(hallid);
	}

	@Override
	@Transactional
	public void removeHall(int hallid) {
		this.hallDAO.removeHall(hallid);
	}

}
