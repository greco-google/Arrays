package ArrayLists;

import java.util.ArrayList;

public class Recipe {

	public static void main(String[] args) {
		
		ArrayList<String> ingredients = new ArrayList();
		
		ingredients.add("Flour");
		ingredients.add("Sugar");
		ingredients.add("Cocoa");
		ingredients.add("Oil");
		ingredients.add("Eggs");
		ingredients.add("Baking soda");

		ingredients.remove(0);
		
		ingredients.set(3, "Olive oil");
		
		//ingredients.set(0, 200);
		
		//for each
		for (String ingredient : ingredients) {
			System.out.println(ingredient);
		}

	}

}
