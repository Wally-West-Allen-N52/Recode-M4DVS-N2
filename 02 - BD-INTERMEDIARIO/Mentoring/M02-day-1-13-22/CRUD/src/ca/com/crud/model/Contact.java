package ca.com.crud.model;

import java.sql.Date;

public class Contact {
	private int ContactID;
	private String ContactName;
	private int Age;
	private Date RegistrationDate;
	
	public int getContactID() {
		return ContactID;
	}
	public void setContactID(int contactID) {
		ContactID = contactID;
	}
	public String getContactName() {
		return ContactName;
	}
	public void setContactName(String contactName) {
		ContactName = contactName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Date getRegistrationDate() {
		return RegistrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		RegistrationDate = registrationDate;
	}
	@Override
	public String toString() {
		return "Contact [ContactID=" + ContactID + ", ContactName=" + ContactName + ", Age=" + Age
				+ ", RegistrationDate=" + RegistrationDate + "]";
	}
	
	
}
