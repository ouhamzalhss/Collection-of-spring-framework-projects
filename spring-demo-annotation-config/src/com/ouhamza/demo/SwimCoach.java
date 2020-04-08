package com.ouhamza.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements ICoach {
	
	private FourtuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;

	public SwimCoach(FourtuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDaillyWorkout() {
		// TODO Auto-generated method stub
		return "swim 1000m as a warm up";
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
