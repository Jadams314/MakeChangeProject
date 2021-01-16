package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the price of the item? ");
		double price = kb.nextDouble();
		System.out.println("How much money are you entering?");
		double tend = kb.nextDouble();
		double quarter = .25, dime = .10, pennie = .01;
		
		
		
		if (price > tend) {
			System.out.println("You have not provided the right amount of money.");
			
		}
		else if (price == tend) {
			System.out.println("You have provided the the exact amount of money. Have a good day!");
		}
		
		double change = tend - price;
		
		// need to round the double to only showing the first 2 decimal places... then tackle the output
		
		if (price < tend ) {
				
		}
		
		
		kb.close();
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