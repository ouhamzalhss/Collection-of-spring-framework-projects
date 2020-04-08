package com.ouhamza.demo;

public class FootCoach implements Coach {

	private FournitureService fournitureService;
	private String email;
	
	@Override
	public String getDaillyWorkout() {
		return "Foot: spend 30 minutes of batting practice";
	}

	public void setFournitureService(FournitureService fournitureService) {
		System.out.println("setter call");
		this.fournitureService = fournitureService;
	}

	@Override
	public String getFourniture() {
		// TODO Auto-generated method stub
		return "ok: "+fournitureService.getFourniture();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("setter email call");
		this.email = email;
	}


}
