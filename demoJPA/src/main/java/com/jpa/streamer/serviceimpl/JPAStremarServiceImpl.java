package com.jpa.streamer.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.Employee;
import com.speedment.jpastreamer.application.JPAStreamer;

import lombok.NoArgsConstructor;

@Service

public class JPAStremarServiceImpl {

//
//	private final JPAStreamer jpaStreamer;
//	
//	
//
//	public JPAStremarServiceImpl() {
//		this.jpaStreamer = null;
//		
//	}
//
//
//
//	@Autowired
//    public JPAStremarServiceImpl(final JPAStreamer jpaStreamer) {
//        this.jpaStreamer = jpaStreamer;
//    }
//	
//	
//
//	public List<Employee> getAllEmployeesByStreamer(){
//		return jpaStreamer.stream(Employee.class).collect(Collectors.toList());
//	}
}
