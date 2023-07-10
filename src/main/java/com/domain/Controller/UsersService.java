package com.domain.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Address.*;
import com.domain.Consumers.*;
import com.domain.Farmers.*;


@Service
public class UsersService {

	// Repositories
	@Autowired
	private ConsumersRepository consumerRepo;
	@Autowired
	private FarmerRespository farmerRepo;
	
	
	// ********* Consumer Functions ***********
	// Show all Consumers ** FOR TESTING**
	public List<Consumer> findAllConsumers() {
		return consumerRepo.findAll();
	}
	
	// Add new consumer
	public Consumer addNewConsumer(Consumer consumer) {
		return consumerRepo.save(consumer);
	}
	
	// Update Consumer
	public void updateConsumer(Consumer consumer) {
		 consumerRepo.save(consumer);
	}
	
	// Delete a Consumer
	public void deleteConsumerByID(int id) {
		consumerRepo.deleteById(id);
	}
	
	// ********* Farmer Functions ********* 
	// Show all Farmers ** FOR TESTING**
	public List<Farmer> findAllFarmers() {
		return farmerRepo.findAll();
	}
	
	// Add new farmer
	public Farmer addNewFarmer(Farmer farmer) {
		 return farmerRepo.save(farmer);
	}
	
	// Delete a Farmer
	public void deleteFarmerByID(int id) {
		farmerRepo.deleteById(id);
	}
	
	// Update Farmer
	public void updateFarmer(Farmer farmer) {
		farmerRepo.save(farmer);
	}
	
	//Find Consumer by Email
	public List<Consumer> findbyEmailConsumer(String email) {
		return consumerRepo.findByEmail(email); 
	}
	
	// Find Farmer by Email
	public List<Farmer> findbyEmailFarmer(String email) {
		return farmerRepo.findByEmail(email);
	}
	
	// Return Consumer Address
	public Address returnConsumerAddress(int id) {
		return consumerRepo.findById(id).get().getAddress();
	}
	
	// Return Farmer Address
	public Address returnFarmerAddress(int id) {
		return farmerRepo.findById(id).get().getAddress();
	}
	
	// Get Farmer by ID
	public Farmer returnFarmerByID(int id) {
		return farmerRepo.findById(id).get();
	}
	
	// Get Consumer by ID
	public Consumer returnConsumerByID(int id) {
		return consumerRepo.findById(id).get();
	}
	
	// Getters and Setters
	public ConsumersRepository getConsumerRepo() {
		return consumerRepo;
	}
	public void setConsumerRepo(ConsumersRepository consumerRepo) {
		this.consumerRepo = consumerRepo;
	}
	public FarmerRespository getFarmerRepo() {
		return farmerRepo;
	}
	public void setFarmerRepo(FarmerRespository farmerRepo) {
		this.farmerRepo = farmerRepo;
	}
	

}
