package com.ty.spring_items_project.dto;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Item {

	public void used() {
	System.out.println("to code");
	}

}
