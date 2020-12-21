package com.src.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="halls")
public class Hall {

	@Id
	@Column(name="hallid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hallid;
	
	private String  hallname;
	
	private String  halladdress;
	private String  hallcity;
	private String  hallstate;
	public int getHallid() {
		return hallid;
	}
	public void setHallid(int hallid) {
		this.hallid = hallid;
	}
	public String getHallname() {
		return hallname;
	}
	public void setHallname(String hallname) {
		this.hallname = hallname;
	}
	public String getHalladdress() {
		return halladdress;
	}
	public void setHalladdress(String halladdress) {
		this.halladdress = halladdress;
	}
	public String getHallcity() {
		return hallcity;
	}
	public void setHallcity(String hallcity) {
		this.hallcity = hallcity;
	}
	public String getHallstate() {
		return hallstate;
	}
	public void setHallstate(String hallstate) {
		this.hallstate = hallstate;
	}
	@Override
	public String toString() {
		return "Hall [hallid=" + hallid + ", hallname=" + hallname + ", halladdress=" + halladdress + ", hallcity="
				+ hallcity + ", hallstate=" + hallstate + "]";
	}
	
}
