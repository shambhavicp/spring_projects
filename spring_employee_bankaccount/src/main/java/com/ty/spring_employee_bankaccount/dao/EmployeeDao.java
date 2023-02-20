package com.ty.spring_employee_bankaccount.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.spring_employee_bankaccount.dto.Employee;

@Component
public class EmployeeDao {
	
	@Autowired
	public EntityManager entityManager;
	
	public void saveEmployee(Employee employee) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		System.out.println("Inserted");
		
	}
	
	public void updateEmployee(Employee employee) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee1=entityManager.find(Employee.class, employee.getId());
		if(employee1!=null) {
			employee.setId(employee.getId());
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		System.out.println("Updated");
		}else {
			System.out.println("Id not present");
		}
	}
	public void deleteEmployee(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee=entityManager.find(Employee.class, id);
		if(employee!=null){
			employee.setId(id);
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			System.out.println("deleted");
		}else {
			System.out.println("id not present");
		}
	}
	
	public void getEmployeeById(int id) {
		Employee employee=entityManager.find(Employee.class, id);
		System.out.println(employee);
	}
	
	public List<Employee> getAllEmployee(){
		Query query=entityManager.createQuery("select e from Employee e");
		List<Employee> list=query.getResultList();
		return list;
		
	}

}
