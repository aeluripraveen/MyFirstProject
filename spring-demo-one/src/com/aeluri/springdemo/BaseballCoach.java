package com.aeluri.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
