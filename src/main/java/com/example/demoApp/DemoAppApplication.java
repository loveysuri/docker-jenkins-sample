package com.example.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAppApplication {
    
	@GetMapping("/message")
	public String getMessage(){
		return "Hello from Docker! , my jenkins pipeline is ready";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

}
