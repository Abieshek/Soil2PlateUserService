package com.domain.Consumers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository 
public interface ConsumersRepository extends JpaRepository<Consumer, Integer> {

	List<Consumer> findByEmail(String email);
}
