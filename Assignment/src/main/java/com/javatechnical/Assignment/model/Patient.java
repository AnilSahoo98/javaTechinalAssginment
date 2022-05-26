package com.javatechnical.Assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Patient {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Id;
	String name;
	Long phone;
	String addres;
	String email;
	String password;
	public Patient(int id, String name, Long phone, String addres, String email, String password) {
		super();
		Id = id;
		this.name = name;
		this.phone = phone;
		this.addres = addres;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", name=" + name + ", phone=" + phone + ", addres=" + addres + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
}
