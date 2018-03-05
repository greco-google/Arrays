package Exam;

import java.util.ArrayList;

public class Ch6FreeResponse {
	public static void main(String[] args) {
		
		//#25
		public double computeAverage(int[] values, int elements) {
			
			double sum = 0;
			int[] elements1 = {2, 4, 11, 27, 5};
			    for(int i = 0; i < elements1.length; i++) { 
			    	sum += elements1[i];
			    //	sum = sum + elements1[i]; 
			    double average = sum / values.length;
			    
			    		//System.out.println(sum);
			    System.out.println("Average value of array element is " + average);
			    }
		}
		
		
		
//		//#28
		//public static void main(String[] args) {
//		ArrayList<String> ChocolateOrders = new ArrayList();
//		
//		ChocolateOrders.add("Milk Chocolate");
//		ChocolateOrders.add("Caramel");
//		ChocolateOrders.add("Cookies and Cream");
//		ChocolateOrders.add("Caramel");
//		ChocolateOrders.add("Milk Chocolate");
//		
//		for (String ChocolateOrder : ChocolateOrders) {
//			System.out.println(ChocolateOrder);
//		}
//
//		
//		ChocolateOrders.remove(1);
//		ChocolateOrders.remove(2);
//		
//		System.out.println("\nThe new list of chocolates is:");
//		for (String ChocolateOrder : ChocolateOrders) {
//			System.out.println("\t" + ChocolateOrder);
//		}
		
	}
}

