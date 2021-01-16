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
		
		while (change > 0){
			 while	(change >= 20) {
				change = change - 20;
				dollar20++;
		//		System.out.print("You get " + dollar20 + " twenty dollar bill ");
				}
		
			while (change >= 10) {
				change = change - 10;
				dollar10++;
		//		System.out.print("You get " + dollar10 + " ten dollar bill ");
				}
			while (change >= 5) {
				change = change - 5;
				dollar5++;
		//		System.out.print("You get " + dollar5 + " five dollar bill ");
			 	}
			while (change >= 1) {
				change = change - 1;
				dollar1++;
		//		System.out.print("You get " + dollar1 + " one dollar bill ");
				}
			while (change >= .25) {
				change = change - .25;
				quarter++;
		//		System.out.print("You get " + quarter + " one dollar bill ");
				}
			while (change >= .10) {
				change = change - .10;
				dime++;
		//		System.out.print("You get " + dime + " one dollar bill ");
				}
			while (change >=.05) {
				change = change - .05;
				nickel++;
		//		System.out.print("You get " + nickel + " one dollar bill ");
				}
			while (change >= .01) {
				change = change - .01;
				penny++;
		//		System.out.print("You get " + penny + " one dollar bill ");
				}
			}
		if (dollar20 >=1) {	
			System.out.println(dollar20 + " twenty dollar bills, " + dollar10 + " ten dollar bills, " + dollar5 + " five dollar bills, "
										+ dollar1 + " one dollar bills, " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, "
										+ penny + " pennies ");
									}
		else if (dollar10 >=1) {
			System.out.println(dollar10 + " ten dollar bills, " + dollar5 + " five dollar bills, "
					+ dollar1 + " one dollar bills, " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, "
					+ penny + " pennies ");
			}
		else if (dollar5 >=1) {
			System.out.println(dollar5 + " five dollar bills, "
					+ dollar1 + " one dollar bills, " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, "
					+ penny + " pennies ");
			}
		else if (dollar1 >=1) {
			System.out.println(dollar1 + " one dollar bills, " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, "
					+ penny + " pennies ");
			}
		else if (quarter >=1) {
			System.out.println(quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, "
					+ penny + " pennies ");
			}
		else if (dime >=1) {
			System.out.println(dime + " dimes, " + nickel + " nickels, "
					+ penny + " pennies ");
			}
		else if (nickel >=1) {
			System.out.println(nickel + " nickels, "+ penny + " pennies ");
			}
		else {
			System.out.println(penny + "pennies");
			}
		}
}
		// for loop to keep printing out the quarter? if in the for loop .75 prints quarter 3 *'s?
	
//			int remainder1;
//				
//				int remainder2 = (int) ((change - remainder1) /.25);
//				System.out.print("and " + remainder2 + " quarters");
//			
//				remainder1 = (int) ( (change - remainder2) / .10 );
//				System.out.print(" and " + remainder1 + " dimes");
//				
//				
//				break;
//			}
//			else if (change % quarter != 0) {
//				remainder1 = (int)  (change * 4);
//				System.out.print("You get " + remainder1 + " quarters");
//				break;
//			 	}
//			 else if (change % dime == 0.1) {
//				remainder1 = (int) (change * 10);
//				System.out.print("You get " + remainder1 + " dimes");
//				break;
//			}
//			 else if( change % nickel == 0.05) {
//				remainder1 = (int) (change * 20);
//				System.out.print("You get " + remainder1 + " nickles");
//				break;
//			}
//			 else if (change % penny == 0.01) {
//				remainder1 = (int) (change * 10);
//				System.out.print("You get " + remainder1 + " pennies");
//				break;
//			}
//			 else {
//				 System.out.println("Loop fail");
//				 break;
//			 	}
//			
						

//
//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.

//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.