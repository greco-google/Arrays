package TrackingSalesLab;

import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		int sum;
		int maxSalesPerson = 0;
		int maxSales = 0;
		int minSalesPerson = 0;
		int minSales = 0;

		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the amout of people:");
	    int SALESPEOPLE = input.nextInt();
	    int sales[] = new int[SALESPEOPLE];
		
		for (int i = 0; i < sales.length; i++) {
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = input.nextInt();
		}

		System.out.println("\nSalesperson   Sales");
		System.out.println("--------------------");
		sum = 0;
		for (int i = 0; i < sales.length; i++) {
			System.out.println("     " + (i + 1) + "         " + sales[i]);
			sum += sales[i];
		}

		System.out.println("\nTotal sales: " + sum);
	}
}
