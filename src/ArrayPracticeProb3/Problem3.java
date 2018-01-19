package ArrayPracticeProb3;
import java.lang.reflect.Array;
import java.util.Scanner; 

public class Problem3 {

//	Create a mini console game that asks for the number 
//	of words you want to enter into an Array. Enter 
//	each word and then a letter. Print out feedback that
//	says "Yep its got one of those" or "Sorry that "
//	"letter is not in the word" depending on 
//	whether on not the word entered contains the 
//	letter specified.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter size of array:");
	    Scanner user = new Scanner(System.in);
	    int inputLength =user.nextInt();
	    int array[] = new int[inputLength];
	    }

public static void fillArray(Array[] array) {
	for(int i = 0; i < array.length; i++) {
	     System.out.println("Enter a string:");
		String word[i] = input.nextString();
	     System.out.println("Enter a letter:");
	     String letter = in.nextLine();
			
	     if(findKeyword(0, letter) >= 0) {
				System.out.println("Yep its got one of those");
			}
			else
				System.out.println("Sorry that letter is not in the word");
		}
	}
}		
	
