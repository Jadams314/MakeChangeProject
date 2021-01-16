package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the price of the item? ");
		double price = kb.nextDouble();
		System.out.println("How much money are you entering?");
		double tend = kb.nextDouble();
		kb.close();
		
		double change = tend - price;
		int quarter = 0, dime = 0, penny = 0, nickel = 0;
		
		int dollar20 = 0;
		int dollar10 = 0;
		int dollar5 = 0;
		int dollar1 = 0;
		
		if (price > tend) {
			System.out.println("You have not provided the right amount of money.");
			
		}
		else if (price == tend) {
			System.out.println("You have provided the the exact amount of money. Have a good day!");
		}
//		System.out.println( (double) Math.round(change * 100)/100);
		int changeInt = (int) Math.round(change * 100);
		while (changeInt > 0){
			 while	(changeInt >= 2000) {
				 changeInt = changeInt - 2000;
				dollar20++;
				}
		
			while (changeInt >= 1000) {
				changeInt = changeInt - 1000;
				dollar10++;
				}
			while (changeInt >= 500) {
				changeInt = changeInt - 500;
				dollar5++;
			 	}
			while (changeInt >= 100) {
				changeInt = changeInt - 100;
				dollar1++;
				}
			while (changeInt >= 25) {
				changeInt = changeInt  - 25;
				quarter++;
				}
			while (changeInt >= 10) {
				changeInt = changeInt - 10;
				dime++;
				}
			while (changeInt >=05) {
				changeInt = changeInt - 05;
				nickel++;
				}
			while (changeInt >= 01) {
				changeInt = changeInt - 01;
				penny++;
				}
			}
		if (dollar20 >=1) {	
			System.out.print(dollar20 + " twenty dollar bills ");
									}
		 if (dollar10 >=1) {
			System.out.print(dollar10 + " ten dollar bills ");
			}
		 if (dollar5 >=1) {
			System.out.print(dollar5 + " five dollar bills ");
			}
		 if (dollar1 >=1) {
			System.out.print(dollar1 + " one dollar bills ");
			}
		 if (quarter >=1) {
			System.out.print(quarter + " quarters ");
			}
		 if (dime >=1) {
			System.out.print(dime + " dimes ");
			}
		 if (nickel >=1) {
			System.out.print(nickel + " nickels ");
			}
		if (penny >=1) {
			System.out.print(penny + "pennies ");
			}
		}
	}



//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.