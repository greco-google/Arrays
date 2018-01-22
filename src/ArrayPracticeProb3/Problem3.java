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
	    String words[] = new String[inputLength];
	    String letter;

	for(int i = 0; i < words.length; i++) {
	     System.out.println("Enter a word:");
	     words[i] = input.next();
	     System.out.println("You entered " + words[i]);
	     System.out.println("Enter a letter:");
	     letter = input.next();
			
	     if(words[i].contains(letter)) {
				System.out.println("Yep its got one of those");
			}
			else
				System.out.println("Sorry that letter is not in the word");
		}
	}
}		
	
