package com.xworkz.ATMExample;

public class ATMTester {

	public static void main(String[] args) {
		ATM iciciBankManager = new ATM(9632,1234567891125645l);
		iciciBankManager.addCash(1000000.00);
		
		ATM user1 = new ATM(3654,1234567891254125l);
		user1.addCash(1000000.00);
		user1.withdraw(1400);
		System.out.println("CAsh in Atm " +iciciBankManager.checkBalanceOfcashInATM());
		
	}

}
