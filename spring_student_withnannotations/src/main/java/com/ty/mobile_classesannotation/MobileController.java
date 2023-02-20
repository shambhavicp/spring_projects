package com.ty.mobile_classesannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileController {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SimConfig.class);
		Mobile mobile=context.getBean("mobile", Mobile.class);
		mobile.use();
	}

}
