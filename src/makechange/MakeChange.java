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
		double quarter = .25, dime = .10, penny = .01, nickel = .05;
		int dollar = 1, dollar5 = 5, dollar10 = 10, dollar20 = 20;
		
		if (price > tend) {
			System.out.println("You have not provided the right amount of money.");
			
		}
		else if (price == tend) {
			System.out.println("You have provided the the exact amount of money. Have a good day!");
		}
		
		
		// for loop to keep printing out the quarter? if in the for loop .75 prints quarter 3 *'s?
		while (tend > price) {
			int remainder1;
			if (change % dollar != 1) {
				remainder1 = (int) change;
				System.out.print("You get " + remainder1 + " dollars ");
				
				int remainder2 = (int) ((change - remainder1) /.25);
				System.out.print("and " + remainder2 + " quarters");
			
				remainder1 = (int) ( (change - remainder2) / .10 );
				System.out.print(" and " + remainder1 + " dimes");
				
				
				break;
			}
			else if (change % quarter != 0) {
				remainder1 = (int)  (change * 4);
				System.out.print("You get " + remainder1 + " quarters");
				break;
			 	}
			 else if (change % dime == 0.1) {
				remainder1 = (int) (change * 10);
				System.out.print("You get " + remainder1 + " dimes");
				break;
			}
			 else if( change % nickel == 0.05) {
				remainder1 = (int) (change * 20);
				System.out.print("You get " + remainder1 + " nickles");
				break;
			}
			 else if (change % penny == 0.01) {
				remainder1 = (int) (change * 10);
				System.out.print("You get " + remainder1 + " pennies");
				break;
			}
			 else {
				 System.out.println("Loop fail");
				 break;
			 	}
			}
				
		
	}	
}		

//
//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.

//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.