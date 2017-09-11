/**
 * 
 */
package com.proshanto.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author proshanto
 */

@Service
public class Person {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
}
