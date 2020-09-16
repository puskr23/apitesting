package com.practice.service;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TestingRepository  extends CrudRepository<Testing, Integer>{

	
	@Query(value = "SELECT msisdn  FROM testing ",nativeQuery = true )
     List<String> getUsers();

}
