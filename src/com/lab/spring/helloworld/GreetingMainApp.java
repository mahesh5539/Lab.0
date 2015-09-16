package com.lab.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingMainApp {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("/beans.xml");
		Greeting objGreet = (Greeting) context.getBean("greeter");
		String greetName = objGreet.getGreeting();
		System.out.println("Hello world from "+greetName);
	}

}
