package com.ty.spring_items_project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring_items_project.dto.Bike;
import com.ty.spring_items_project.dto.Item;
import com.ty.spring_items_project.dto.Laptop;
import com.ty.spring_items_project.dto.Pen;

public class ItemController {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("item.xml");
		Item item1=context.getBean("bike",Bike.class);
		item1.used();
		
		Item item2=context.getBean("laptop",Laptop.class);
		item2.used();
		
		Item item3=context.getBean("pen",Pen.class);
		item3.used();
		
		Pen pen1=(Pen)item3;
		System.out.println(pen1.getCost());

		
		Pen pen=context.getBean("pen",Pen.class);
		System.out.println(pen.getCost());
		
		
	}
	
}
