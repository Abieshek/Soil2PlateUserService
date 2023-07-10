package com.domain.Controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Address.*;
import com.domain.Consumers.*;
import com.domain.Farmers.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserServiceController {

	// Service Class
	@Autowired
	private UsersService userService;

	
	// Getter and Setter
	public UsersService getUserService() {
		return userService;
	}
	public void setUserService(UsersService userService) {
		this.userService = userService;
	}
	
	
	// ***********CONTROLLER FUNCTIONS**********
	// Show all Consumers
	@GetMapping("/consumers")
	public List<Consumer> retreiveAllConsumers() {
		return userService.findAllConsumers();
	}
	// Show all farmers
	@GetMapping("/farmers")
	public List<Farmer> retreiveAllFarmers() {
		return userService.findAllFarmers();
	}
	
	// Insert a new consumer
	@PostMapping("/addConsumer")
	public Consumer addConsumer(@RequestBody Consumer consumer) {
		return userService.addNewConsumer(consumer);
	}
	// Insert a new Farmer
	@PostMapping("/addFarmer")
	public Farmer addFarmer(@RequestBody Farmer farmer) {
		return userService.addNewFarmer(farmer);
	}
	
	// Update Consumer
	@PutMapping("/consumers")
	public void updateConsumers(@RequestBody Consumer consumer) {
		userService.updateConsumer(consumer);
	}
	// Update Farmer
	@PutMapping("/farmers")
	public void updateFarmers(@RequestBody Farmer farmer) {
		userService.updateFarmer(farmer);
	}
	
	// Delete Mapping by ID 
	@DeleteMapping("/customers/{id}")
	public void deleteConsumer(@PathVariable int id) {
		userService.deleteConsumerByID(id);
	}
	@DeleteMapping("/farmers/{id}")
	public void deleteFarmer(@PathVariable int id) {
		userService.deleteFarmerByID(id);
	}
	
	//Find Consumer By Email
	@GetMapping("/consumers/{email}/email") 
	public Consumer retrieveConsumerByPhoneNumber(@PathVariable String email) { 
			List<Consumer> consumerlist = userService.findbyEmailConsumer(email);
			return consumerlist.get(0);
	 }
	
	// Find Farmer By Email
	@GetMapping("/farmers/{email}/email") 
	public Farmer retrieveFarmerByPhoneNumber(@PathVariable String email) { 
			List<Farmer> farmerList = userService.findbyEmailFarmer(email);
			return farmerList.get(0);
	 }
	
	// Return Consumer Address 
	@GetMapping("/consumers/{id}/address")
	public Address retrieveConsumerAddress(@PathVariable int id) {
		return userService.returnConsumerAddress(id);
	}
	
	// Return Farmer Address 
	@GetMapping("/farmers/{id}/address")
	public Address retrieveFarmerAddress(@PathVariable int id) {
		return userService.returnFarmerAddress(id);
	}
	
	// Get Farmer by ID
	@GetMapping("/farmers/{id}")
	public Farmer getFarmerByID(@PathVariable int id) {
		return userService.returnFarmerByID(id);
	}
	
	// Get Consumer by ID
	@GetMapping("/consumer/{id}")
	public Consumer getConsumerByID(@PathVariable int id) {
		return userService.returnConsumerByID(id);
	}
	
	
}
