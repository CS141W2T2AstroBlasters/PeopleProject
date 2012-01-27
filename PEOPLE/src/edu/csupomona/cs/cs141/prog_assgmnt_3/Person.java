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
 * The package contains a class Person and an executable file.
 * The purpose of this package was to practice using arrays and
 * making packages and executable codes.
 */

/**
 * This class creates an object called Person. A Person object can represent any
 * person, and as such it has a name and an age. However it also has an ID
 * number used to uniquely identify each person in the case of two persons
 * having the same name. It does not have the behaviors of a normal person
 * however because it is only being created for record keeping purposes.
 * 
 * @author Cody Sheppard
 */
public class Person {
	/**
	 * This field is used to give and store the name of a {@link Person}. It has
	 * no initial value but is set in {@link Main} using the
	 * {@link #setName(String)} method.
	 */
	private String name;
	/**
	 * This field is used to store the {@link Person}'s age, and is set, like
	 * {@link #name} in {@link Main} using the {@link #setAge(int)} method.
	 */
	private int age;
	/**
	 * This field stores the unique identifier of each {@link Person}. The ID is
	 * set by the user when creating the {@link Person} in {@link Main} using
	 * the {@link #setID(int)} method.
	 */
	private int ID;

	/**
	 * This is the default constructor for a {@link Person}. They have no
	 * {@link #name}, {@link #ID}, or {@link #age} until set by the user in
	 * {@link Main}.
	 */
	public Person() {

	}

	/**
	 * This method is used to assign a name to the {@link Person}.
	 * 
	 * @param name
	 *            The name to be to be given to the {@link Person}.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method gives the {@link Person} an age.
	 * 
	 * @param age
	 *            The age of the {@link Person}.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * This method sets the unique identifier, or ID, of the {@link Person}.
	 * 
	 * @param iD
	 *            The unique ID of the {@link Person}.
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * This method is used to retrieve the {@link #name} of the {@link Person}.
	 * 
	 * @return The {@link #name} of the {@link Person}.
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method is used to retrieve the {@link #age} of the {@link Person}.
	 * 
	 * @return The {@link #age} of the {@link Person}.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * This method is used to retrieve the {@link #iD} of the {@link Person}.
	 * 
	 * @return The {@link #iD} of the {@link Person}.
	 */
	public int getID() {
		return ID;
	}

}
