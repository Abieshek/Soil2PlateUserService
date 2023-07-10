package com.domain.Consumers;

import com.domain.Address.Address;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "consumers")
public class Consumer {
	// DATA FIELDS
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="consumer_id")
    private int consumerId;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;
    @Column(name="phone_number")
    private Long phoneNumber;
    @Column(name="subscribed")
    private boolean subscribed;
    @Column(name="reward_points")
    private float rewardPoints;
    @Column(name="carbon_offset")
    private float carbonOffset;
    
    // Embedded Address Object
    @Embedded
    private Address address;
    
    
    // Constructors
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumer(int consumerId, String email, String password, String name, Long phoneNumber, boolean subscribed,
			float rewardPoints, float carbonOffset, Address address) {
		super();
		this.consumerId = consumerId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.subscribed = subscribed;
		this.rewardPoints = rewardPoints;
		this.carbonOffset = carbonOffset;
		this.address = address;
	}
	
	
	// Getters and Setters
	public int getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
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
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	public float getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(float rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public float getCarbonOffset() {
		return carbonOffset;
	}
	public void setCarbonOffset(float carbonOffset) {
		this.carbonOffset = carbonOffset;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	


}
