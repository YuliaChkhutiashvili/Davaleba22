package com.example.demo;

import com.example.demo.model.Phone;
import com.example.demo.repository.PhoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Davaleba21Application {

	public static void main(String[] args) {
		SpringApplication.run(Davaleba21Application.class, args);
	}

	@Bean
	public CommandLineRunner run(PhoneRepository phoneRepository) {
		return args -> {
			Phone phone = new Phone();
			phone.setModelName("iPhone 15");
			phone.setBrandName("Apple");
			phone.setPrice(1299.99);
			phone.setShop("Alta");

			phoneRepository.save(phone);
			System.out.println("Save!");
		};
	}
}
