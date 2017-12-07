package com.aeluri.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Fast bolwing practice daily for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
