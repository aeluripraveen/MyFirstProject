package com.aeluri.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//Load the spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
				Coach theCoach= context.getBean("myCoach",Coach.class);
				
		//call the method on bean
				System.out.println(theCoach.getDailyWorkout());
		
		//method's of Fortune
				System.out.println(theCoach.getDailyFortune());
		//close the App context
				context.close(); 
	}

}
