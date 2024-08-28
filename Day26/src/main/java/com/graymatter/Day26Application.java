package com.graymatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graymatter.service.AuthorService;

@SpringBootApplication
public class Day26Application implements CommandLineRunner {

	@Autowired
	AuthorService service;
	
	public static void main(String[] args) {
		SpringApplication.run(Day26Application.class, args);
		System.out.println("application Started");
	}
	
	@Override
	public void run(String... args) {
		// TODO Auto-generated method stub
		//service.saveAuthorWithBooks();
		service.removeAuthor(52);

	}

}
