package com.ty._bank_classesannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person { 
	
	@Autowired
	@Qualifier("HDFC")
	private BankAccount bankAccount;
	
	public void check() {
		bankAccount.balance();
	}

}
