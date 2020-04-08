package com.ouhamza.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach coach = applicationContext.getBean("tennisCoach",ICoach.class);
		ICoach coach2 = applicationContext.getBean("tennisCoach",ICoach.class);
		Boolean result = (coach == coach2);
		
		System.out.println(result);
		System.out.println(coach);
		System.out.println(coach2);
		
		applicationContext.close();
	}
}
