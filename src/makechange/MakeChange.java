package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		MakeChange m = new MakeChange();
		int[] money = new int[8];

		// makes call to scanner to get user input for change value
		double changeInt = m.calcChange();

		// call to calcute the price and amount tendered to give amount needed to be returened

		money = m.sortChange(changeInt);
		m.printChange(money);
	}

	private double calcChange() {
		Scanner kb = new Scanner(System.in);
		double price, tend, change;

		System.out.println("What is the price of the item? ");
		price = kb.nextDouble();

		System.out.println("How much money are you entering?");
		tend = kb.nextDouble();
		kb.close();

		change = tend - price;

		if (price > tend) {
			System.out.println("You have not provided the right amount of money.");

		} else if (price == tend) {
			System.out.println("You have provided the the exact amount of money. Have a good day!");
		}

		System.out.print("Change due: " + (double) Math.round(change * 100) / 100 + "  \n");

		int changeInt = (int) Math.round(change * 100);

		return changeInt;
	}

	/*
		Breaking down to determine how much of each bill you have
		sortChange creates an 8 slot array, and increments the number in each slot based on the value of changeInt. 
		which is then taken to the printChange method to send prompt to the user
	 */

	private int[] sortChange(Double changeInt) {
		int[] money = new int[8];

		while (changeInt > 0) {

			while (changeInt >= 2000) {
				changeInt = changeInt - 2000;
				money[7]++;
			}
			while (changeInt >= 1000) {
				changeInt = changeInt - 1000;
				money[6]++;
			}
			while (changeInt >= 500) {
				changeInt = changeInt - 500;
				money[5]++;
			}
			while (changeInt >= 100) {
				changeInt = changeInt - 100;
				money[4]++;
			}
			while (changeInt >= 25) {
				changeInt = changeInt - 25;
				money[3]++;
			}
			while (changeInt >= 10) {
				changeInt = changeInt - 10;
				money[2]++;
			}
			while (changeInt >= 05) {
				changeInt = changeInt - 05;
				money[1]++;
			}
			while (changeInt >= 01) {
				changeInt = changeInt - 01;
				money[0]++;
			}
		}

		return money;
	}

	/*
		Here we assign a string value to each slot of the array. Then we look into the array and see the value for each slot.
		Ex: Pennny   Money[0] = 2 then there would be 2 pennies.
	 */ 
	private void printChange(int[] money) {
		int penny = money[0];
		int nickel = money[1];
		int dime = money[2];
		int quarter = money[3];
		int dollar1 = money[4];
		int dollar5 = money[5];
		int dollar10 = money[6];
		int dollar20 = money[7];

		if (dollar20 > 1) {
			System.out.print(dollar20 + " twenty dollar bills, ");
		}
		if (dollar20 == 1) {
			System.out.print(dollar20 + " twenty dollar bill, ");
		}
		if (dollar10 > 1) {
			System.out.print(dollar10 + " ten dollar bills, ");
		}
		if (dollar10 == 1) {
			System.out.print(dollar10 + " ten dollar bill, ");
		}
		if (dollar5 > 1) {
			System.out.print(dollar5 + " five dollar bills, ");
		}
		if (dollar5 == 1) {
			System.out.print(dollar5 + " five dollar bill, ");
		}
		if (dollar1 > 1) {
			System.out.print(dollar1 + " one dollar bills, ");
		}
		if (dollar1 == 1) {
			System.out.print(dollar1 + " one dollar bill, ");
		}
		if (quarter > 1) {
			System.out.print(quarter + " quarters, ");
		}
		if (quarter == 1) {
			System.out.print(quarter + " quarter, ");
		}
		if (dime > 1) {
			System.out.print(dime + " dimes, ");
		}
		if (dime == 1) {
			System.out.print(dime + " dime, ");
		}
		if (nickel > 1) {
			System.out.print(nickel + " nickels, ");
		}
		if (nickel == 1) {
			System.out.print(nickel + " nickel, ");
		}
		if (penny > 1) {
			System.out.print(penny + " pennies ");
		}
		if (penny == 1) {
			System.out.print(penny + " penny ");
		}
	}
}