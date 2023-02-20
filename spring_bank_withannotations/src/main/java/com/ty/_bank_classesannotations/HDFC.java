package com.ty._bank_classesannotations;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements BankAccount {

	public void balance() {
		System.out.println("HDFC balance is 30000");

	}

}
