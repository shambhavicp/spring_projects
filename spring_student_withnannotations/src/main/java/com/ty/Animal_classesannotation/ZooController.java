package com.ty.Animal_classesannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooController {

	public static void main(String[] args) {
	
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Zoo zoo=context.getBean("zoo", Zoo.class);
		zoo.food();
		
		
	}

}
