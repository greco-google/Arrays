package ArrayLists;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Raw Type (not recommended) Java 1.2 - 1.5 when Generics were introduced
		//ArrayList numbers = new ArrayList();
		
		//Use Generics and assign a type with <> diamond operator
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		//numbers.add("four");
		numbers.add(4);
		numbers.add(5);
		
//	//Enhanced for loop aka for: each loop
//			for (Object number: numbers) {
//				if ((Integer) number % 2 == 0) {
//				System.out.println(number);
//				}
//			}
		
		
		//Enhanced for loop aka for: each loop
		for (Integer number: numbers) {
			if (number % 2 == 0) {
			System.out.println(number);
			}
		}
		
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
	}

}
