package com.lab.spring.helloworld;


import java.util.List;

public interface Greeter {
	
	void setNames(List<String> names); // names of the authors
	
	String getGreeting();
}

