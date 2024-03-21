package com.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jpa.entity.Employee;
import com.jpa.streamer.serviceimpl.JPAstreamerBean;
import com.speedment.jpastreamer.application.JPAStreamer;
import com.speedment.jpastreamer.application.JPAStreamerBuilder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;




@SpringBootApplication(scanBasePackages = "com.jpa.streamer.serviceimpl")

public class DemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
}
