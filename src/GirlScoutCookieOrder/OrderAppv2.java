package GirlScoutCookieOrder;

import java.util.Scanner;

public class OrderAppv2 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	MasterOrder myOrder = new MasterOrder();
	CookieOrder order;
	
	System.out.println("Welcom to our Girl Scout Cookie Ordererer");
	System.out.println("Please select a task");
	System.out.println("Press 1 to order cookies");
	System.out.println("Press 2 to remove an order");
	System.out.println("Press 3 to update an order");
	System.out.println("Press 4 to view current order");
	System.out.println("Press 5 to exit");
	
	String choice  = input.nextLine();
	
	while(!choice.equals("5")) {
		if(choice.equals("1")) {
			System.out.println("What type of cookie would you like?");
			System.out.println("[Thin Mints], [Tagalongs], [Samoas], [Dosidos]");
			String cookieName = input.nextLine();
			System.out.println("How many boxes of " + cookieName + " do you want?");
			int numBoxes = input.nextInt();
			order = new CookieOrder(cookieName, numBoxes);
			myOrder.addOrder(order);
			}
		}
	}
}