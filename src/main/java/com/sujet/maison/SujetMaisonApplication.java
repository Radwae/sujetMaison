package com.sujet.maison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sujet.maison.business.SujetMaisonBusinessApi;

@SpringBootApplication
public class SujetMaisonApplication {

	
	@Autowired
	SujetMaisonBusinessApi app ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SujetMaisonApplication.class, args);
	}

}
