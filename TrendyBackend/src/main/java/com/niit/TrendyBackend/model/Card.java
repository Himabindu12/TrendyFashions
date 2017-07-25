//package com.niit.TrendyBackend.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Component;
//
//@Entity
//@Table
//@Component
//
//public class Card {
//	@Id
//	private String card_Id;
//	private String card_number;
//	private String card_holdername;
//    private String card_expirydate;
//    @ManyToOne
//	@JoinColumn(name="user_Id")
//	private User user;
//	public String getCard_Id() {
//		return card_Id;
//	}
//	public void setCard_Id(String card_Id) {
//		this.card_Id = card_Id;
//	}
//	public String getCard_number() {
//		return card_number;
//	}
//	public void setCard_number(String card_number) {
//		this.card_number = card_number;
//	}
//	public String getCard_holdername() {
//		return card_holdername;
//	}
//	public void setCard_holdername(String card_holdername) {
//		this.card_holdername = card_holdername;
//	}
//	public String getCard_expirydate() {
//		return card_expirydate;
//	}
//	public void setCard_expirydate(String card_expirydate) {
//		this.card_expirydate = card_expirydate;
//	}
//    
//}
