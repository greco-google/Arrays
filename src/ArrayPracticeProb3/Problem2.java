package ArrayPracticeProb3;

public class Problem2 {

//	Create an Array to hold the names of 5 people. 
//	Print the first letter of each of their names.
	
	public static void main(String[] args) {
		
//		Create an Array of your top four vacation spots. 
//		Print the first spot and the last spot in your 
//		array.
		
		String [] Names = new String [5];
		
		Names[0] = "Gracien";
		Names[1] = "Ajani";
		Names[2] = "Shane";
		Names[3] = "Nima";
		Names[4] = "Eugene";
		
		System.out.println("The first letter for each of the five names are...\n" 
				+  Names[0].substring(0, 1) + ", " +  Names[1].substring(0, 1) + ", "
				+  Names[2].substring(0, 1) + ", " +  Names[3].substring(0, 1) + ", "
				+  Names[4].substring(0, 1) + ".");
		
		}

	}
