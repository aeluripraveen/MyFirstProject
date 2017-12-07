package com.aeluri.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach=context.getBean("myCoach", Coach.class);
		Coach alphaCoach=context.getBean("myCoach", Coach.class);
		System.out.println("Both are the same Objects: "+ (theCoach==alphaCoach));
		System.out.println("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		context.close();
	}

}
