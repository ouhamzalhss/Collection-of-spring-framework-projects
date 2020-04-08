package com.ouhamza.demo;

public class BascketCoach implements Coach{
	
	private FournitureService fournitureService;
	
	public BascketCoach(FournitureService thefournitureService) {
		// TODO Auto-generated constructor stub
		fournitureService = thefournitureService;
	}
	
	@Override
	public String getDaillyWorkout() {
		return "BascketBall: spend 30 minutes of batting practice";
	}

	@Override
	public String getFourniture() {
		// TODO Auto-generated method stub
		return fournitureService.getFourniture();
	}

}
