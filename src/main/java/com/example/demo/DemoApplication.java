package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext appContext
				= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student student = (Student) appContext.getBean("student");
		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Phone: " + student.getPh());
		System.out.println("Address: " + student.getAdd());
	}
}
