package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.CreditCard;
import com.ciq.dao.Deditcard;


@Service("CardService")
public class CardSeviceImpl implements CardService{
	
	@Autowired
 private CreditCard creditCard;
	
	@Autowired
	private Deditcard deditcard;

	public void getCardDetails() {
		creditCard.getCreditCardDetails();
		deditcard.getDeditCard();
		
	}

}
