package com.bank.functionality;

import java.util.ArrayList;
import java.util.List;

import com.bank.account.Account;

public class Functionality {
	List<Account> arraylist=new ArrayList<>();
	//Account account1=new Account();
	int count=0;
	public String addAccount(int accountNo,String accountName,int balance) {
		
		Account account=new Account(accountNo,accountName,balance);
		if(count>0) {
		for (Account i:arraylist) {
			if(i.getAccountNo()==accountNo) {
				return "Generated AccountNo Same Please repeat the process"+i.getAccountNo();
			}
		}
		}
		arraylist.add(account);
		count++;
		
	
		return"account created successfuly";	
	}
	public String withdrawl(long accountNo,long withdrawlAmount) {
		
		for(Account i:arraylist) {
			if(i.getAccountNo()==accountNo) {
				if(i.getBalance()-withdrawlAmount>=500) {
					long balance;
			i.setBalance(i.getBalance()-withdrawlAmount);
			return "left Amount::"+i.getBalance();
			}
				else {
					return "Insufficient Balance";
				}
		
		
		}
		}
		
		return null;
	}
	
	public String showAll() {
		String output="";
		for(Account i:arraylist) {
			output+=" AccountNo->"+i.getAccountNo()+"  AccountHolderName->"+i.getAccountHolderName()+" Balance->"+i.getBalance()+"\n";
		}
		return output;
	}
	public String showByAccountNo(long accountNo) throws InvalidAccountNumberException {
		String output="";
		for(Account i:arraylist) {
			if(i.getAccountNo()==accountNo) {
				output=" AccountNo->"+i.getAccountNo()+"  AccountHolderName->"+i.getAccountHolderName()+" Balance->"+i.getBalance()+"\n";
				return output;
			}
			}
		throw new InvalidAccountNumberException("exception aa gaya");
		
		
	}
}
