package com.src.spring.dao;

import java.util.List;

import com.src.spring.model.Hall;

public interface HallDAO {

	public void addHall(Hall h);
	public void updateHall(Hall h);
	public List<Hall> listHalls();
	public Hall getHallById(int hallid);
	public void removeHall(int hallid);
}
