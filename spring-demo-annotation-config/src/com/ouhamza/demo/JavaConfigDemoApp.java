package com.ouhamza.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		ICoach coach = context.getBean("tennisCoach",ICoach.class);
		System.out.println(coach.getDaillyWorkout());
		
		ICoach coach1 = context.getBean("tennisCoach",ICoach.class);
		System.out.println(coach1.getFortune());
		
		context.close();
		
	}

}
