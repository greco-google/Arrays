package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class DogApp {

	public static void main(String[] args) {
		
//		ArrayList<Dog> dogs = new ArrayList<>();
//
//		
//		dogs.add(new Dog("Fido", "Bulldog", 2));
//		dogs.add(new Dog("Sparky", "Terrier", 5));
//		
////		//or
////		Dog fido = new Dog("Fido", "Bulldog", 2);
////		dogs.add(fido);
//		
//		System.out.println("Here are the dogs in our shelter");
//		for (Dog dog: dogs) {
//			System.out.println(dog.getName());
//		}
//		System.out.println("Lets add a dog to our shelter");
//		System.out.println("Name your dog");
//		//String name = input.nextLine();
	
	Scanner input = new Scanner(System.in);
	 
	ArrayList<Dog> dogs = new ArrayList<>();
	 
	Dog fido = new Dog("Fido", "Bulldog", 2);
	 
	dogs.add(fido);
	dogs.add(new Dog("Sparky", "Terrier", 5));
	 
	System.out.println("Here are the dogs in our shelter");
	for (Dog dog : dogs) {
	System.out.println(dog.getName());
	}
	 
	System.out.println("Lets add a dog to the shelter");
	System.out.println("Name your dog");
	String name = input.nextLine();
	System.out.println("What type?");
	String type = input.nextLine();
	System.out.println("Age?");
	int age = input.nextInt();
	 
	dogs.add(new Dog(name, type, age));
	 
	System.out.println("Here are all of our dogs");
	for (Dog dog : dogs) {
	System.out.println(dog.getName() + " " + dog.getBreed());
		}
	} 
}
