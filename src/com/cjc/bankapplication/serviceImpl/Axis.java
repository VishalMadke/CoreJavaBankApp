package com.cjc.bankapplication.serviceImpl;

import java.util.Scanner;

import com.cjc.bankapplication.model.Account;
import com.cjc.bankapplication.service.RBI;

public class Axis implements RBI {

	Account ac=null;
	Scanner sc = new Scanner(System.in);
	public void createAccount()
	{
		System.out.println("Welcome to Account Opening section");
		ac=new Account();
		System.out.println("Enter Account No : ");
		ac.setAcNo(sc.nextLong());
		System.out.println("Enter Account Holder Name : ");
		ac.setAcName(sc.next()+sc.nextLine());
		System.out.println("Enter Account Holder Address : ");
		ac.setAcAddress(sc.next()+sc.nextLine());
		System.out.println("Enter Account Holder Mobile No : ");
		ac.setMobileNo(sc.nextLong());
		System.out.println("Enter Account Holder Adhar No : ");
		ac.setAdharNo(sc.nextLong());
		System.out.println("Enter Account Holder PAN No : ");
		ac.setPanNo(sc.next());
		System.out.println("Enter Account Holder Gender : ");
		ac.setGender(sc.next());
		System.out.println("Enter Account Balance : ");
		ac.setBalance(sc.nextDouble());
		
		System.out.println("Account Created Succesfully : ");	
	}	
	public void viewAccountDetails()
	{
		if(ac!=null)
		{
			System.out.println("***********Account Details**********");
			System.out.println("Account NO : "+ac.getAcNo());
			System.out.println("Account Holder Name : "+ac.getAcName());
			System.out.println("Account Holder Addres : "+ac.getAcAddress());
			System.out.println("Account Holder Mobile No : "+ac.getMobileNo());
			System.out.println("Account Holder Adhar No : "+ac.getAdharNo());
			System.out.println("Account Holder PAN No : "+ac.getPanNo());
			System.out.println("Account Holder Gender : "+ac.getGender());
			System.out.println("Account Holder Balance : "+ac.getBalance());
			
			System.out.println("**************************************");
		}
		else
		{
			System.out.println("Account has not been created , You have to create account first : ");
			System.out.println();
		}
	}
	
	public void depositeMoney()
	{
		if(ac!=null)
		{
			System.out.println("Enter Amount You Want To Deposite : ");
			int DepoAmo = sc.nextInt();
			if(DepoAmo>=100)
			{		//  5500=   5000     +    500
				double newbal=ac.getBalance()+DepoAmo;
				ac.setBalance(newbal);
				System.out.println("Amount credited Succesfully....!"+DepoAmo);
			}
			else {
				System.out.println("Please Add money more than or 100 ");
			}
		}
		else {
			System.out.println("Account has not been Created , You have to create Account first ");
		}
	}
	public void withdrawMoney()
	{
		if(ac!=null)
		{
			System.out.println("Enter Amount You Want To Withdraw ");
			int wdAmo = sc.nextInt();
			if(wdAmo>=100 & wdAmo<=10000)
			{
				double newbal=ac.getBalance()-wdAmo;
				ac.setBalance(newbal);
				System.out.println("Amount Withdrawl Succesfully : "+wdAmo);
			}
			else {
				System.out.println("Enter Amount Greater Than 100 And Less Than 10000 ");	
			}
		}
		else {
			System.out.println("Account has not Been created , you have to create Account first ");
		}
	}
	public void viewBalance()
	{
			System.out.println("Your Current Account balance is : "+ac.getBalance());
	}
	public void updateDetails()
	{
		System.out.println("Enter 1 to update name /n 2 for update mobileNo /n 3 for aadharNo /n 4 for PanNo /n 5 for Address: ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
				System.out.println("Enter Account Holder name You Want to replace");
				ac.setAcName(sc.next());
				break;
		case 2:
				System.out.println("Enter Mobile No You Want To Replace : ");
				ac.setMobileNo(sc.nextLong());
				break;
		case 3:
				System.out.println("Enter aadharNo You Want to Replace : ");
				ac.setAdharNo(sc.nextLong());
				break;
		case 4: System.out.println("Enter PAN No You Wanr to Replace : ");
				ac.setPanNo(sc.next());
				break;		
		case 5: System.out.println("Enter your new Address ");
				String address = sc.next();
				ac.setAcAddress(address);
				break;
		default :
			System.out.println("You Provide Wrong Input");
			break;
		}
	}	
}