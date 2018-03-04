package Exam;

import java.util.ArrayList;

public class Ch6Exam {

public static void main(String[] args) {
		
		//Raw Type (not recommended) Java 1.2 - 1.5 when Generics were introduced
		//ArrayList numbers = new ArrayList();
		
		//Use Generics and assign a type with <> diamond operator
		ArrayList<Integer> values = new ArrayList<>();
		
		int[]values1 = {9, 4, 12, 2, 4, 8, 18};
			for(int i = 0; i < values1.length; i++) {
				values1[i] += 1;
			}
		System.out.println(values1[4]);
	}
}
//[I@75b84c92
//[I@75b84c92
//[I@75b84c92