package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Scheme 1: Saving");

	}

	public void fixed() {
		System.out.println("Scheme 2: Fixed Deposit");

	}

	public static void main(String[] args) {
		BankInfo c = new BankInfo();
		c.saving();
		c.fixed();
		c.deposit();
	}
}
