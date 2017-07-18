package com.nvhung.ManggerBankingExample.model;

public enum AccountCardType {
	DebitCard("Debit Card"), CreditCard("Credit Card"), PrepaidCard("Prepaid Card");

	String accountCardType;

	private AccountCardType(String accountCardType) {
		this.accountCardType = accountCardType;
	}

	public String getaccountCardType() {
		return accountCardType;
	}
}
