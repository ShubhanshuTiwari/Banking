package com.bank.entry;

import com.bank.functionality.Functionality;

public class Entry {
 
	public static void main(String[] args) {
		Functionality functionality=new Functionality();
		
		System.out.println(functionality.addAccount(199625,"Ram",1100));
		System.out.println(functionality.addAccount(199626,"Shyam",2000));
		System.out.println(functionality.withdrawl(199625,500));
		System.out.println(functionality.showAll());
		try {
		System.out.println(functionality.showByAccountNo(199645));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
