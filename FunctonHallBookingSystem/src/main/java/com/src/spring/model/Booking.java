package com.src.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class Booking {

	@Id
	@Column(name="bookingid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingid;
	
	private String  booking_username;
	
	private String  bookingdate;
	private String  booking_customername;
	private String  accountno;
	private String  booking_mobileno;
	private String  totalamount;
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getBooking_username() {
		return booking_username;
	}
	public void setBooking_username(String booking_username) {
		this.booking_username = booking_username;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getBooking_customername() {
		return booking_customername;
	}
	public void setBooking_customername(String booking_customername) {
		this.booking_customername = booking_customername;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getBooking_mobileno() {
		return booking_mobileno;
	}
	public void setBooking_mobileno(String booking_mobileno) {
		this.booking_mobileno = booking_mobileno;
	}
	public String getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", booking_username=" + booking_username + ", bookingdate="
				+ bookingdate + ", booking_customername=" + booking_customername + ", accountno=" + accountno
				+ ", booking_mobileno=" + booking_mobileno + ", totalamount=" + totalamount + "]";
	}
	
	
}
