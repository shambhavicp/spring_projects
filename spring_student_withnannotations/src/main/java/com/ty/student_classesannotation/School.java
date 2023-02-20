package com.ty.student_classesannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {

	@Autowired
	private Student student;
	public void teach() {
		student.study();
	}
}
