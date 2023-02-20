package com.ty.spring_employee_bankaccount.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.spring_employee_bankaccount.dao.EmployeeDao;
import com.ty.spring_employee_bankaccount.dto.BankAccount;
import com.ty.spring_employee_bankaccount.dto.Config;
import com.ty.spring_employee_bankaccount.dto.Employee;

public class EmployeeController {

	public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	
	Employee employee=context.getBean("employee", Employee.class);

	BankAccount bankAccount=context.getBean("bankAccount", BankAccount.class);

	EmployeeDao employeeDao=context.getBean("employeeDao", EmployeeDao.class);

	Scanner scanner=new Scanner(System.in);
	boolean exit=true;
	
	do {
	System.out.println(" 1.Add Employee \n 2.Update Employee \n 3.Remove Employee \n 4 GetEmployee details By ID \n 5.GetAllEmployee \n 6.exit");
	System.out.println("========Enter your choice========");

	int choice=scanner.nextInt();
	switch(choice) {
	
	case 1: {
		System.out.println("Enter the Employee name");
		String name=scanner.next();
		
		System.out.println("Enter the Employee Address");
		String address=scanner.next();
		
		System.out.println("Enter the Employee phone");
		long phone=scanner.nextLong();
		
		employee.setName(name);
		employee.setAddress(address);
		employee.setPhone(phone);
		
		System.out.println("Enter the BankAcoount name");
		String bname=scanner.next();
		
		System.out.println("Enter the Bank Address");
		String baddress=scanner.next();
		
		System.out.println("Enter the Bank ifsc");
		String ifsc=scanner.next();
		
		bankAccount.setName(bname);
		bankAccount.setAddress(baddress);
		bankAccount.setIfsc(ifsc);
		
		employee.setBankAccount(bankAccount);
		
		employeeDao.saveEmployee(employee);
		
	}
	break;
	
	case 2:{
		System.out.println("Enter the Employee id");
		int id=scanner.nextInt();
		
		System.out.println("Enter the Employee name");
		String name=scanner.next();
		
		System.out.println("Enter the Employee Address");
		String address=scanner.next();
		
		System.out.println("Enter the Employee phone");
		long phone=scanner.nextLong();
		
		employee.setId(id);
		employee.setName(name);
		employee.setAddress(address);
		employee.setPhone(phone);
		
		System.out.println("Enter the BankAccount id");
		int bid=scanner.nextInt();
		
		System.out.println("Enter the BankAcoount name");
		String bname=scanner.next();
		
		System.out.println("Enter the Bank Address");
		String baddress=scanner.next();
		
		System.out.println("Enter the Bank ifsc");
		String ifsc=scanner.next();
		
		bankAccount.setId(bid);
		bankAccount.setName(bname);
		bankAccount.setAddress(baddress);
		bankAccount.setIfsc(ifsc);
		
		employee.setBankAccount(bankAccount);
		
		employeeDao.updateEmployee(employee);
		
	}
	break;
	case 3:{
		System.out.println("Enter the Employee id");
		int id=scanner.nextInt();
		
		employeeDao.deleteEmployee(id);
	}
	break;
	case 4:{
		System.out.println("Enter the Employee id");
		int id=scanner.nextInt();
		
		employeeDao.getEmployeeById(id);
	}
	break;
	case 5:{
		
		System.out.println(employeeDao.getAllEmployee());
	}
	break;
	case 6:{
		exit=false;
		System.out.println("Thank u");
	}
	break;
	default:{
		System.out.println("Invalid");
	}
	}

	}while(exit);
	}

}
