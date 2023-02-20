package com.ty.spring_item_project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring_item_project.dto.Item;

public class ItemController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("item.xml");
		Item item1=context.getBean("item",Item.class  );
		System.out.println("the item name : "+item1.getName());
		System.out.println("the item price : "+item1.getPrice());
		System.out.println("the item quantity : "+item1.getQuantity());
		System.out.println("the item manufracturer : "+item1.getManufracturer());
	}

}
