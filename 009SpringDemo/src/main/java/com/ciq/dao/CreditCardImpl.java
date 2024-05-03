package com.ciq.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CreditCardImpl  implements CreditCard {

	public void getCreditCardDetails() {
		System.out.println("SBI CreditCardDetails: CreaditCard : 9876 2345 12345");
		
	}

}
