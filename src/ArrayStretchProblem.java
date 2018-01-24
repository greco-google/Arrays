
public class ArrayStretchProblem {
	public static void main(String[] args) {
		
		String source = "this, that, the other";
		String[] elements = source.split(", ");
		
		System.out.println(elements[0]); // prints "this"
		System.out.println(elements[1]); // prints "that"
		System.out.println(elements[2]); // prints "the other"
	}
}
