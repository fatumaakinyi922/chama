package com.example.chama;

import com.example.chama.Entity.monthlyPayments;
import com.example.chama.Repository.calamityRepository;
import com.example.chama.Repository.monthlyPaymentsRepository;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication



public class ChamaApplication {

	public  static void main(String[] args) {
		SpringApplication.run(ChamaApplication.class, args);
	}


}
