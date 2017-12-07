package com.aeluri.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It:"+ fortuneService.getFortune();
	}
	public void doMyStartupStuff(){
		System.out.println("TrachCoach: inside method doMyStartuoStuff");
	}
	public void doMyCleanUpStuff(){
		System.out.println("TrachCoach: inside method doMyCleanUpStuff");
	}

}
