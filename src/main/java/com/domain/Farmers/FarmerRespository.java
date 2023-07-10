package com.domain.Farmers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.domain.Consumers.Consumer;


@Repository 
public interface FarmerRespository extends JpaRepository<Farmer, Integer> {

	List<Farmer> findByEmail(String email);
}
