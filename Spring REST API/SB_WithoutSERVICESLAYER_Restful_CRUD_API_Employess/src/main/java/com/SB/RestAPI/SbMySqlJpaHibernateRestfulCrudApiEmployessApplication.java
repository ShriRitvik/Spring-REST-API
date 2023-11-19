package com.SB.RestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//WITHOUT SERVICE LAYER
//CLIENT=>CONTOLLER=>REPOSITORY

@SpringBootApplication
public class SbMySqlJpaHibernateRestfulCrudApiEmployessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMySqlJpaHibernateRestfulCrudApiEmployessApplication.class, args);
	}

}
