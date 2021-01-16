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
		System.out.print( "Change due: " + (double) Math.round(change * 100)/100 + "  \n");
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
		 if (dime ==1) {
				System.out.print(dime + " dime, ");
		 	}
		 if (nickel > 1) {
			System.out.print(nickel + " nickels, ");
			}
		if (nickel ==1) {
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