package ArrayLists;

import java.util.ArrayList;

public class ArrayListLiveDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList();
		
		numbers.add(2);
		numbers.add(4);
		numbers.add(5);
		
		numbers.set(0, 200);
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		

	}

}