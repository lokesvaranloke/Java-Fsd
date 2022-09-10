package com.samples.S01springcoredi.scopes;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
//scopes in spring
	//default--singleton -- both the objects will point to same reference
	//prototype --everytime u ask for get new reference will be cretaed
	
//applicationscoped objectes--same object used in entire application

	public static void main(String[] args) {

	
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S01springcoredi/scopes/SpringConfig.xml");

		
		Employee emp1 = (Employee) springContainer.getBean("emp");
		System.out.println(emp1.hashCode());
		
		Employee emp2 = (Employee) springContainer.getBean("emp");
		System.out.println(emp2.hashCode());
	}
}
