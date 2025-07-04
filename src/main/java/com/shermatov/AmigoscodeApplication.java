package com.shermatov;

import com.shermatov.customer.Customer;
import com.shermatov.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AmigoscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CustomerRepository customerRepository) {
		return args -> {
			Customer alex = new Customer(
					"Alex",
					"alex@gmail.com",
					19

			);
			Customer jamila = new Customer(

					"Jamila",
					"jamila@gmail.com",
					23
			);
			List<Customer> customers = List.of(alex, jamila);
//			customerRepository.saveAll(customers);
		};
	}


}
