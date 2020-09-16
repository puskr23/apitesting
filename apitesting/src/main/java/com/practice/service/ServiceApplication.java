package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ServiceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
	@Component
	class Runner implements CommandLineRunner {
		@Autowired
		TestingRepository repo;
		@Autowired
		Appending apd;
		
	@Override
	public void run(String... args) throws Exception
	{
		List<String> phone=repo.getUsers();
		for(String number:phone)
		{
		  System.out.println("Number="+number);
		  System.out.println("Operator="+apd.getOperator(number));
		  System.out.println("===================================");
		}
		
		
		
	}

}
}
