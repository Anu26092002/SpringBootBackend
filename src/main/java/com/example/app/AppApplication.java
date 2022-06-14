package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.models.User;
import com.example.app.repositories.UserRepository;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	@Autowired
	public AppApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		if (userRepository.findAll().isEmpty()) {

			userRepository.save(new User("Anurag", "Ghosh", 19, "BTech", "Mumbai", "India"));
			userRepository.save(new User("Harsh", "Jain", 20, "BTech", "Mumbai", "India"));
			userRepository.save(new User("Larry", "Page", 45, "MSc", "New York", "USA"));
			userRepository.save(new User("Tim", "Lee", 65, "Phd", "London", "UK"));
			userRepository.save(new User("Ryan", "Renolyds", 42, "MSc", "Los Angeles", "USA"));
			userRepository.save(new User("Ellen", "Page", 55, "BA", "Los Angeles", "USA"));
			userRepository.save(new User("Navin", "Ready", 39, "MTech", "Hyderabad", "India"));
			userRepository.save(new User("Larry", "Page", 45, "MSc", "New York", "USA"));
			userRepository.save(new User("Arvind", "Singh", 45, "MSc", "Pune", "India"));

		}

		for (

		User user : userRepository.findAll()) {
			System.out.println(user);
		}
	}

}
