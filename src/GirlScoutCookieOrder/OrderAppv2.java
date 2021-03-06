package GirlScoutCookieOrder;

import java.util.Scanner;

public class OrderAppv2 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	MasterOrder myOrder = new MasterOrder();
	CookieOrder order;
	
	System.out.println("Welcome to our Girl Scout Cookie Ordererer");
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
			String variety = input.nextLine();
			System.out.println("How many boxes of " + variety + " do you want?");
			int numBoxes = input.nextInt();
			input.nextLine();
			order = new CookieOrder(variety, numBoxes);
			myOrder.addOrder(order);
			}
		
		
		else if(choice.equals("2")) {
			System.out.println("What type of cookie do you want to remove?");
			System.out.println("[Thin Mints], [Tagalongs], [Samoas], [Dosidos]");
			String variety = input.nextLine();
			myOrder.removeVariety(variety);
			}
		
		else if(choice.equals("3")) {
			System.out.println("What type of cookie do you want to update?");
			System.out.println("[Thin Mints], [Tagalongs], [Samoas], [Dosidos]");
			String variety = input.nextLine();
			System.out.println("Now, how many boxes of " + variety + " do you want?");
			int numBoxes = input.nextInt();
			input.nextLine();
			myOrder.updateOrder(variety, numBoxes);

			}
		
		
		else if(choice.equals("4")) {
			System.out.println();
			System.out.println("Your Current Order: ");
			myOrder.showOrder();
			System.out.println();
			}
		
		else if(choice.equals("5")) {
			System.exit(0);
			}
		else {
			System.out.println("Invalid input");
		}
		System.out.println("Please select another Task");
		System.out.println("Press 1 to order cookies");
		System.out.println("Press 2 to remove an order");
		System.out.println("Press 3 to update an order");
		System.out.println("Press 4 to view current order");
		System.out.println("Press 5 to exit");
		choice = input.nextLine();
		}
	}
}