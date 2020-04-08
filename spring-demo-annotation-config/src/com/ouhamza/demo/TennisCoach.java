package com.ouhamza.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("singleton")
public class TennisCoach implements ICoach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FourtuneService fortuneService;
	
	
/*	@Autowired
	public TennisCoach(FourtuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}*/

/*
	@Autowired
	public void setFortuneService(FourtuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/


	public TennisCoach() {
		System.out.println("init construct..");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Call postConstruct methode");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Call preDestroy method");
	}

	@Override
	public String getDaillyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
