//package com.niit.TrendyBackend.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Component;
//@Entity
//@Table
//@Component("billing")
//public class Billing {
//	@Id
//	private String Billing_ID;
//	private String House_Number;
//	private String Country_Name;
//	private String City_Name;
//	private String PinCode;
//	private String EMail_ID;
//	private String PhoneNumber;
//	@OneToOne
//	@JoinColumn(name="User_ID")
//	private User user;
//	
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	public String getBilling_ID() {
//		return Billing_ID;
//	}
//	public void setBilling_ID(String billing_ID) {
//		Billing_ID = billing_ID;
//	}
//	public String getHouse_Number() {
//		return House_Number;
//	}
//	public void setHouse_Number(String house_Number) {
//		House_Number = house_Number;
//	}
//	public String getCountry_Name() {
//		return Country_Name;
//	}
//	public void setCountry_Name(String country_Name) {
//		Country_Name = country_Name;
//	}
//	public String getCity_Name() {
//		return City_Name;
//	}
//	public void setCity_Name(String city_Name) {
//		City_Name = city_Name;
//	}
//	public String getPinCode() {
//		return PinCode;
//	}
//	public void setPinCode(String pinCode) {
//		PinCode = pinCode;
//	}
//	public String getEMail_ID() {
//		return EMail_ID;
//	}
//	public void setEMail_ID(String eMail_ID) {
//		EMail_ID = eMail_ID;
//	}
//	public String getPhoneNumber() {
//		return PhoneNumber;
//	}
//	public void setPhoneNumber(String phoneNumber) {
//		PhoneNumber = phoneNumber;
//	}
//	
//	
//
//}
