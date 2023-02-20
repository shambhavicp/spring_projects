package com.ty._bank_classesannotations;

import org.springframework.stereotype.Component;

@Component
public class ICICI implements BankAccount {

	public void balance() {

		System.out.println("balance in icici is 10000");

	}

}
