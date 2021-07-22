package com.xworkz.ATMExample;

public class ATM {

	private static double cashInATM;
	private int atmPin;
	private long atmCardNum;
	private long transactionNum;
	static long counter = 145236;
	private boolean validity;

	public ATM(int atmPin, long atmCardNum) {
		transactionNum = counter;
		counter++;
		if (checkIfValid(atmPin, atmCardNum)) {
			this.atmPin = atmPin;
			this.atmCardNum = atmCardNum;
			this.validity = true;

		} else {
			System.out.println("Invalid transaction check your pin is correct or card is valid");
		}

	}

	public void withdraw(int amount) {
		if (amount > 0 && cashInATM > amount && validity == true) {
			cashInATM -= amount;
			System.out.println("collect your cash of amount " + amount);
		} else {
			System.out.println("No cashh in ATM");
		}
	}

	public void addCash(double amount) {
		if (this.atmPin == 9632 && this.atmCardNum == 1234567891125645l) {
			if (amount > 0) {
				cashInATM += amount;
			} else {
				System.out.println("Please load valid amount");
			}

		} else {
			System.out.println("you are not a manager");
		}
	}

	public double checkBalanceOfcashInATM() {
		if (this.atmPin == 9632 && this.atmCardNum == 1234567891125645l) {
			return cashInATM;
		} else {
			System.out.println("YOU are not a manager");
			return 0;
		}
	}

	public boolean checkIfValid(int atmPin, long atmCardNum) {
		if (findDigitInGivenNum(atmCardNum) == 16) {
			if (findDigitInGivenNum(atmPin) == 4) {
				return true;
			} else {
			System.out.println("Wrong ATM pin");
		}
		}else {
			System.out.println("Invalid card");
		}
		return false;
	}

	private static int findDigitInGivenNum(int number) {
		int n = 0;
		while (number != 0) {
			n++;
			number = number / 10;
		}
		return n;

	}

	private static int findDigitInGivenNum(long number) {
		int n = 0;
		while (number != 0) {
			n++;
			number = number / 10;
		}
		return n;

	}

}
