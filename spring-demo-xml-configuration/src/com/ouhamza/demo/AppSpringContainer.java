package com.ouhamza.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpringContainer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// constructor dependency injection
		Coach coach1 = (Coach) context.getBean("Mycoach");
		System.out.println(coach1.getFourniture());
		
		// Setter dependency injection
		FootCoach coach = (FootCoach) context.getBean("foot");
		System.out.println(coach.getEmail());
		
		context.close();
	}

}
