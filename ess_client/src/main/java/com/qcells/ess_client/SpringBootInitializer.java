package com.qcells.ess_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootInitializer {


	public static void main(String[] args) {
        String profile = System.getProperty("spring.profiles.active");
        if(profile == null) {
            System.setProperty("spring.profiles.active", "develop");
        }
		SpringApplication.run(SpringBootInitializer.class, args);
	}

}


