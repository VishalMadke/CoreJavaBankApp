package com.cjc.bankapplication.service;

public interface RBI {

    abstract void createAccount();
	void viewAccountDetails();
	void depositeMoney();
	void withdrawMoney();
	void viewBalance();
	void updateDetails();
	
}