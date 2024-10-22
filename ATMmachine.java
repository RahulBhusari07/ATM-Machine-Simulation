package com.start;

import java.util.Scanner;

class ATM {

	float Balance;
	int PIN;

	public ATM() {
		System.out.println("Welcome to ATM Machine");
		System.out.println("Please Enter Your PIN");
	}

	public void checkPin() {
		Scanner sc = new Scanner(System.in);
		int PIN = sc.nextInt();
		if (PIN == 1250) {
			menu();
		} else {
			System.out.println("Please enter valid PIN");
			checkPin();
		}
	}

	public void menu() {

		System.out.println("Enter Your Choice");
		System.out.println("1.Check A/c Balance");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Deposit Money");
		System.out.println("4.EXIT");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			withdrawMoney();
		} else if (opt == 3) {
			depositMoney();
		} else if (opt == 4) {
			return;
		}

		else {
			System.out.println("Please Enter Valid Choice");
			checkPin();
		}

	}

	public void checkBalance() {
		System.out.println("Balance is " + Balance);
		menu();
	}

	public void withdrawMoney() {
		System.out.println("Enter Amount to Withdraw");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if (amount > Balance) {
			System.out.println("Insufficient Balance");
		} else {
			Balance = Balance - amount;
			System.out.println("Money Withdrawal Successfully");
		}
		menu();
	}

	public void depositMoney() {
		System.out.println("Enter Amount to Deposit");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money Deposited Successfully");
		menu();
	}

}

public class ATMmachine {

	public static void main(String[] args) {

		ATM atm = new ATM();
		atm.checkPin();

	}

}
