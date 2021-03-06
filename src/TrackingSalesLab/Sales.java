package TrackingSalesLab;

import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		int sum;
		int maxSalesPerson = 0;
		int maxSales = Integer.MIN_VALUE;
		int minSalesPerson = 0;
		int minSales = Integer.MAX_VALUE;

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
			System.out.println("     " + (i + 1) + "    |   $" + sales[i]);
			sum += sales[i];
		}

		System.out.println("\nTotal sales: $" + sum);
		System.out.println("Average sales: $" + (sum / SALESPEOPLE) + "\n");
		
		for(int i = 0; i < sales.length; i++) {
			if(sales[i] > maxSales) {
				maxSales = sales[i];
				maxSalesPerson = i;
			}
			if(sales[i] < minSales) {
				minSales = sales[i];
				minSalesPerson = i;
			}
		}
		System.out.println("Salesperson "+ (maxSalesPerson + 1) + " had the "
				+ "greatest amout of sales which was:  $" + maxSales);
		System.out.println("Salesperson " + (minSalesPerson + 1) + " had the "
				+ "lowest sales which was:  $" + minSales);	
			
		
	    System.out.println("Enter the amout for the quota:");
	    int quota = input.nextInt();
	    
		
		for (int i = 0; i < sales.length; i++) {
			if (quota <= sales[i]) {
				System.out.println("Salesperson " + (i + 1) + " met "
						+ "the quota with sales of $" + sales[i]);
				}
			}
		}
	}