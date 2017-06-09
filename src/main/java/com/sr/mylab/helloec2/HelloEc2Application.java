package com.sr.mylab.helloec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloEc2Application.class, args);
	}

	@GetMapping
	public String hello() {
		return "OK_CRSP_CCP";
	}
}
