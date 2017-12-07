package com.aeluri.springdemo;

public class MySpringBean {
private String name;
private int id;
private String city;
private MyDepenedBean bean;
public MyDepenedBean getBean() {
	return bean;
}
public void setBean(String bean) {
	System.out.println("IDREF:"+bean);
}
public void setBean(MyDepenedBean bean) {
	System.out.println("REF:"+bean);
}
public MySpringBean(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
} 
}
