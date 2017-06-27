package com.niit.TrendyBackend.model;

public class User {
private String User_ID;
private String User_Name;
private String User_Gender;
private String User_PhoneNumber;
private String User_EMail;
private String User_Password;
private String role="ROLE_USER";
public String getUser_ID() {
	return User_ID;
}
public void setUser_ID(String user_ID) {
	User_ID = user_ID;
}
public String getUser_Name() {
	return User_Name;
}
public void setUser_Name(String user_Name) {
	User_Name = user_Name;
}
public String getUser_Gender() {
	return User_Gender;
}
public void setUser_Gender(String user_Gender) {
	User_Gender = user_Gender;
}
public String getUser_PhoneNumber() {
	return User_PhoneNumber;
}
public void setUser_PhoneNumber(String user_PhoneNumber) {
	User_PhoneNumber = user_PhoneNumber;
}
public String getUser_EMail() {
	return User_EMail;
}
public void setUser_EMail(String user_EMail) {
	User_EMail = user_EMail;
}
public String getUser_Password() {
	return User_Password;
}
public void setUser_Password(String user_Password) {
	User_Password = user_Password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}




}
