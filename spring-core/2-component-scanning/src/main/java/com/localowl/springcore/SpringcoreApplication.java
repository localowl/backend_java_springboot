package com.localowl.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Enables-> auto configuration, component scanning, additional configuration
@SpringBootApplication(
		scanBasePackages = {"com.localowl.springcore","com.localowl.util"}
)
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
