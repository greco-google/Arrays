package ArrayLists;

import java.util.ArrayList;

public class DogApp {

	public static void main(String[] args) {
		
		ArrayList<Dog> dogs = new ArrayList<>();

		
		dogs.add(new Dog("Fido", "Bulldog", 2));
		dogs.add(new Dog("Sparky", "Terrier", 5));
		
//		//or
//		Dog fido = new Dog("Fido", "Bulldog", 2);
//		dogs.add(fido);
		
		System.out.println("Here are the dogs in our shelter");
		for (Dog dog: dogs) {
			System.out.println(dog.getName());
		}
		System.out.println("Lets add a dog to our shelter");
		System.out.println("Name your dog");
		//String name = input.nextLine();
		
	}

}
