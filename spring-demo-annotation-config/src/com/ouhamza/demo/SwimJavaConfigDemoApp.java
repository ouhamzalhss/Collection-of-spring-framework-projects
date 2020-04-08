package com.ouhamza.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(coach.getDaillyWorkout());
		System.out.println(coach.getFortune());
		System.out.println(coach.getEmail());
		context.close();
		
	}

}
