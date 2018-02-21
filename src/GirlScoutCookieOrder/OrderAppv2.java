package GirlScoutCookieOrder;

import java.util.Scanner;

public class OrderAppv2 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	MasterOrder myOrder = new MasterOrder();
	
	System.out.println("Welcom to our Girl Scout Cookie Ordererer");
	System.out.println("Please select a task");
	System.out.println("Press 1 to order cookies");
	System.out.println("Press 2 to remove an order");
	System.out.println("Press 3 to update an order");
	System.out.println("Press 4 to view current order");
	System.out.println("Press 5 to exit");
	
	String choice  = input.nextLine();
	}
}