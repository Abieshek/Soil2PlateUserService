package com.domain.Farmers;

import com.domain.Address.Address;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "farmers")
public class Farmer {
	// DATA FIELDS
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="farmer_id")
    private int farmerId;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;
    @Column(name="phone_number")
    private Long phoneNumber;
    @Column(name="certifications")
    private String certifications;
    @Column(name="energy_usage")
    private float energyUsage;

    // Embedded Address Object
    @Embedded
    private Address address;
    
    
    // Constructors
	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Farmer(int farmerId, String email, String password, String name, Long phoneNumber, String certifications,
			float energyUsage, Address address) {
		super();
		this.farmerId = farmerId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.certifications = certifications;
		this.energyUsage = energyUsage;
		this.address = address;
	}
	
	
	// GETTERS AND SETTERS
	public int getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCertifications() {
		return certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	public float getEnergyUsage() {
		return energyUsage;
	}
	public void setEnergyUsage(float energyUsage) {
		this.energyUsage = energyUsage;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
