package com.baejy.tinc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class TincApplication {

	public static void main(String[] args) {
		SpringApplication.run(TincApplication.class, args);
	}

}
