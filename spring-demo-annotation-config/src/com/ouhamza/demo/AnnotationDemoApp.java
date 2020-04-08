package com.ouhamza.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach coach = context.getBean("tennisCoach",ICoach.class);
		System.out.println(coach.getDaillyWorkout());
		
		ICoach coach1 = context.getBean("tennisCoach",ICoach.class);
		System.out.println(coach1.getFortune());
		
		context.close();
		
	}

}
