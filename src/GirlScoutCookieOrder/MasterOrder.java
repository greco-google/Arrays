package GirlScoutCookieOrder;

import java.util.ArrayList;

public class MasterOrder {
	
	private ArrayList <CookieOrder> orders = new ArrayList<>();
	
	//Default no argument constructor
	public MasterOrder() {
		
	}
	
	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}
	
	public int getTotalBoxes() {
		int totalBoxes = 0;
		for(CookieOrder order: orders) {
			totalBoxes += order.getNumBoxes();
		}
	return totalBoxes;
		
	}
	
	public void removeVariety(String variety) {
		for(int i = orders.size() - 1; i >= 0; i--) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}
	}
	
	public void showOrder() {
		for(CookieOrder order: orders) {
			System.out.println("Variety: " + order.getVariety() 
			+ "Boxes: " + order.getNumBoxes());
		}
	}

}
