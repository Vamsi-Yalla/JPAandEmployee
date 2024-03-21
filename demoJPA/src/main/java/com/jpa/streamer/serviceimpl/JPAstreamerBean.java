package com.jpa.streamer.serviceimpl;

import org.springframework.context.annotation.Configuration;

import com.speedment.jpastreamer.application.JPAStreamer;

@Configuration
public abstract class JPAstreamerBean<Employee> implements JPAStreamer {

	public JPAstreamerBean() {
		super();
	}

	  
	
}
