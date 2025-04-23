package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // It makes the IOC container to search and locate @Scheduled enable b.method() in the spring class
public class BootProj01SpringbootSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj01SpringbootSchedulingApplication.class, args);
	}

}
