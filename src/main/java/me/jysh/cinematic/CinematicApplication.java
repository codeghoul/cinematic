package me.jysh.cinematic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CinematicApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinematicApplication.class, args);
	}

}
