package com.ty.student_classesannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolController {

	public static void main(String[] args) {
	
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		School school=context.getBean("school", School.class);
		school.teach();
	}

}
