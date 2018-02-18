package GirlScoutCookieOrder;

import java.util.Scanner;

public class OrderApp {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	MasterOrder myOrder = new MasterOrder();
	
	myOrder.addOrder(new CookieOrder("Tagalongs", 1));
	myOrder.addOrder(new CookieOrder("Thin Mints", 5));
	myOrder.addOrder(new CookieOrder("Samoas", 2));
	myOrder.addOrder(new CookieOrder("Tagalongs", 3));
	
	System.out.println("You have ordered " + myOrder.getTotalBoxes() + " boxes");
	
	System.out.println("What would you like to remove? Specify a variety or none.");
		String removal = input.nextLine();
		
		if(!removal.equals("none")) {
			myOrder.removeVariety(removal);
			System.out.println("You are removing " + removal);
		}
		System.out.println("Current Order is: ");
		myOrder.showOrder();
	}
}
