package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	@Pattern(regexp="[a-zA-Z]+",message="First Name has one word")
	private String FirstName;
	@Pattern(regexp="[a-zA-Z]+",message="Last Name has one word")
	private String LastName;
	@Size(min=4,message="Gender mustn't be null")
	private String Gender;
	private String BirthDay;
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
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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





