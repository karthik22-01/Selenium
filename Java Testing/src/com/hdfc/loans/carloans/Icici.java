package com.hdfc.loans.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) {
		Icici h=new Icici();
		h.deposit();
		h.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println(" i am overriden withdrawl in ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println(" i am overriden deposit in ICICI");
		
	}

}
