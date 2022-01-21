package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String FirstName;
	private String LastName;
	private String BirthDay;
	private String Gender;
	public Employee(String firstName, String lastName, String birthDay, String gender) {
		super();
		FirstName = firstName;
		LastName = lastName;
		BirthDay = birthDay;
		Gender = gender;
	}
	public Employee(int ID, String birthDay,String firstName,String gender,String lastName) {
		super();
		this.ID=ID;
		FirstName = firstName;
		LastName = lastName;
		BirthDay = birthDay;
		Gender = gender;
	}
	public Employee() {
		super();
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}





