package com.ty._bank_classesannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SBI implements BankAccount {

	public void balance() {

		System.out.println("balance in SBI 20000");
	}

}
