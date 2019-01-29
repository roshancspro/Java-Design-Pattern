package org.corejava.design_pattern.chain;

import java.util.Scanner;

public class ATMDispenseChain {

	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		Scanner input = new Scanner(System.in);
		
			int amount = 0;
			System.out.println("Enter amount to dispense");
			
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				input.close();
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
			input.close();
		

	}

}
