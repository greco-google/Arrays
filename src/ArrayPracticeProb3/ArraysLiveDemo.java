package ArrayPracticeProb3;

import java.util.Scanner;
public class ArraysLiveDemo {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		int [] numbers = new int [5];
//		
//		System.out.println("Enter 5 Integers");
//		numbers[0] = input.nextInt();
//		numbers[1] = input.nextInt();
//		numbers[2] = input.nextInt();
//		numbers[3] = input.nextInt();
//		numbers[4] = input.nextInt();
//		
//		//System.out.println(numbers);//This prints out hex code for that array
//		//System.out.println(numbers[0]);//Prints one number
//		
//		//Print all of the data (array traversal)
//		for(int i = 0; i < numbers.length; i++) {
//			//System.out.println(numbers[i]);
//			System.out.println("Values at index " + i + " is " + numbers[i]);
//		}
		
		Scanner input = new Scanner(System.in);
		int [] numbers = new int [5];
		int max = Integer.MIN_VALUE;// Start at smallest possible number
		int min = Integer.MAX_VALUE;// Start at largest possible number
		
		System.out.println("Enter 5 Integers");
		numbers[0] = input.nextInt();
		numbers[1] = input.nextInt();
		numbers[2] = input.nextInt();
		numbers[3] = input.nextInt();
		numbers[4] = input.nextInt();
		
		//find max and min
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
			if(numbers[i] < min) {
				min = numbers[i];
			}
			System.out.println("Max # found is " + max);
			System.out.println("Min # found is " + min);
			
		}
		
		//System.out.println(numbers);//This prints out hex code for that array
		//System.out.println(numbers[0]);//Prints one number
		
		//Print all of the data (array traversal)
		for(int i = 0; i < numbers.length; i++) {
			//System.out.println(numbers[i]);
			System.out.println("Values at index " + i + " is " + numbers[i]);
		}
		
	}
}
