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
		ingredients.set(2, "Olive oil");
		ingredients.add(0, "Milk");
		ingredients.add(0, "Bake a cake with these ingredients:");

		
		//for each
		for (String ingredient : ingredients) {
			System.out.println(ingredient);
		}

	}

}
