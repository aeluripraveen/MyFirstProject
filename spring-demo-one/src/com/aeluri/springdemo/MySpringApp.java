package com.aeluri.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("myApplicationContext.xml");
	MySpringBean bean= (MySpringBean)context.getBean("mySpringBean");
	bean.setCity("Hyderabad");
	System.out.println(bean.getName()+" : "+bean.getId()+ " : "+ bean.getCity());
	context.getBean("Myid");
}
}
