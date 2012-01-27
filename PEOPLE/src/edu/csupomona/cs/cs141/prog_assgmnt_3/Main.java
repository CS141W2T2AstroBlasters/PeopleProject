/**
 * CS 141: Introduction to Programming and Problem Solving
 * <p>
 * Professor: Edwin Rodr&iacute;guez
 * <p>
 * 
 * Programming Assignment #3
 * <p>
 * 
 * Develop a program that creates an array objects of type Person (using the
 * class developed in class), by prompting the user for information on each
 * person: name, age, and ID.
 * <p>
 * 
 * Team #2 (AstroBlasters)
 * 
 * @author David Khacherian
 * @author Johnny Lam
 * @author Jacob Longazo
 * @author Harrison Nguyen
 * @author Cody Sheppard
 */

package edu.csupomona.cs.cs141.prog_assgmnt_3;

/**
 * Provides class and interface for creating an array of Persons.
 * The package contains a clas Person and an executable file.
 * The purpose of this package was to practice using arrays and
 * making packages and executable codes.
 */

import java.util.Scanner;

/**
 * This is the executable class to create a people registry. The registry is an
 * array of {@link Person} objects, where the array size is set by the user, and
 * then the user creates the {@link Person}'s immediately after. The user is
 * also given the option to view the current registry at the end of the program,
 * at which point the program either displays the registry and then quits, or
 * just quits if the user does not wish to see the registry.
 * 
 * @see java.util#Scanner
 * @author Cody Sheppard
 * 
 */
public class Main {

	/**
	 * This is the main method that executes when the user makes the registry.
	 * The first input the program asks for is the size of the registry,
	 * creating an array of that size to hold {@link Person} objects. Then the
	 * program asks the user for the name of the {@link Person}, then the age,
	 * and the ID. The program then asks the user whether or not they would like
	 * to see the registry that they just created. It then either quits, or
	 * shows the registry and then quits.
	 * 
	 * @param args
	 *            Not used
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many people are you making?: ");
		int x = keyboard.nextInt();
		Person person[] = new Person[x];
		for (int i = 0; i < x; i++) {
			person[i] = new Person();
			System.out.println("Person " + (i + 1));
			System.out.print("Name: ");
			person[i].setName(keyboard.next());
			System.out.print("Age: ");
			person[i].setAge(keyboard.nextInt());
			System.out.print("ID: ");
			person[i].setID(keyboard.nextInt());
		}

		System.out.print("Do you want to print? Y=1, N=2: ");
		int choice = keyboard.nextInt();
		if (choice == 1) {
			for (int i = 0; i < x; i++) {
				System.out.println("Person " + (i + 1));
				System.out.println("Name: " + person[i].getName());
				System.out.println("Age: " + person[i].getAge());
				System.out.println("ID: " + person[i].getID());
				System.out.println();
			}
		}

		else {
			System.out.println("Thank you.");
		}

	}

}
