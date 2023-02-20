package com.ty.spring_items_project.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen implements Item {

	@Value("50.5")
	private double cost;
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void used() {
		System.out.println("to write");
	}

}
