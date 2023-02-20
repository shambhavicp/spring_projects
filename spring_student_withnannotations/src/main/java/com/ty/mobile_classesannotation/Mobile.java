package com.ty.mobile_classesannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Autowired
	private Sim sim;
	
	public void use() {
		sim.call();
	}

}
