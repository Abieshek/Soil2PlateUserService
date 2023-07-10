package com.domain.Address;

import java.util.Set;

import com.domain.Consumers.Consumer;
import com.domain.Farmers.Farmer;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Embeddable
public class Address {
	// DATA FIELDS
	private int unit_number;
	private String street_name;
	private String city;
	private String state;
	private int zip_code;

	// Constructors
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int unit_number, String street_name, String city, String state, int zip_code) {
		super();
		this.unit_number = unit_number;
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
	}

	// Getters and Setters
	public int getUnit_number() {
		return unit_number;
	}

	public void setUnit_number(int unit_number) {
		this.unit_number = unit_number;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

}
