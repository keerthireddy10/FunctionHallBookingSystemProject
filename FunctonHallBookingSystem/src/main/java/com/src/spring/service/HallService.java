package com.src.spring.service;

import java.util.List;

import com.src.spring.model.Hall;

public interface HallService {

	public void addHall(Hall h);
	public void updateHall(Hall h);
	public List<Hall> listHalls();
	public Hall getHallById(int hallid);
	public void removeHall(int hallid);
}
