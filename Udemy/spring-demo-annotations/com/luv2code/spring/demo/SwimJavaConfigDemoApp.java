package com.luv2code.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method the get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the props values injected
		System.out.println("email: " + theCoach.getEmail());
		
		System.out.println("team: " + theCoach.getTeam());
		
		
		// close context
		context.close();

	}

}
