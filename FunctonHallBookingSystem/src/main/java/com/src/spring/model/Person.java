package com.src.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Person {

	@Id
	@Column(name="customerid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerid;
	
	private String customername;
	
	private String customermobileno;
	
	private String customeremail;
	
	private String customerusername;
	
	private String customerpassword;
	
	private String customeraddress;
	
	private String customercity;
	
	private String customerstate;
    
	private String customerpincode;

	
	
	public int getCustomerid() {
		return customerid;
	}



	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}



	public String getCustomername() {
		return customername;
	}



	public void setCustomername(String customername) {
		this.customername = customername;
	}



	public String getCustomermobileno() {
		return customermobileno;
	}



	public void setCustomermobileno(String customermobileno) {
		this.customermobileno = customermobileno;
	}



	public String getCustomeremail() {
		return customeremail;
	}



	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}



	public String getCustomerusername() {
		return customerusername;
	}



	public void setCustomerusername(String customerusername) {
		this.customerusername = customerusername;
	}



	public String getCustomerpassword() {
		return customerpassword;
	}



	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}



	public String getCustomeraddress() {
		return customeraddress;
	}



	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}



	public String getCustomercity() {
		return customercity;
	}



	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}



	public String getCustomerstate() {
		return customerstate;
	}



	public void setCustomerstate(String customerstate) {
		this.customerstate = customerstate;
	}



	public String getCustomerpincode() {
		return customerpincode;
	}



	public void setCustomerpincode(String customerpincode) {
		this.customerpincode = customerpincode;
	}



	@Override
	public String toString() {
		return "Person [customerid=" + customerid + ", customername=" + customername + ", customermobileno="
				+ customermobileno + ", customeremail=" + customeremail + ", customerusername=" + customerusername
				+ ", customerpassword=" + customerpassword + ", customeraddress=" + customeraddress + ", customercity="
				+ customercity + ", customerstate=" + customerstate + ", customerpincode=" + customerpincode + "]";
	}

    

//	@Override
//	public String toString(){
//		return "id="+id+", name="+name+", country="+country;
//	}
	
}
