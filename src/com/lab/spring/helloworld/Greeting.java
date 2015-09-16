package com.lab.spring.helloworld;

import java.util.List;

public class Greeting implements Greeter {

	List<String> names;
	public void setNames(List<String> names) {
		this.names = names;
		
	}
	public String getGreeting() {
		
		return names.get(0);
	}

}
