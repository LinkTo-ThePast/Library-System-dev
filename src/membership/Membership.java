package membership;

import java.util.Arrays;


public class Membership {
	
	// attributes: ---> basic info for clients/readers
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String membershipType;
	 
	// constructor
	public Membership(String firstName, String lastName, String email, int age, String membershipType) {
		firstName = this.firstName;
		lastName = this.lastName;
		email = this.email;
		age = this.age;
		membershipType = this.membershipType;
	}
	
	// methods:

	// 1. retrieve a book or books from the library;
	
	private int bookToRead() {
		int maxBooks = 0; // --> initialize variable, then return, not define again;
		if(membershipType == "regular") {
			return maxBooks = 2;
		}
		else if(membershipType == "student") {
			return maxBooks = 3;
		}
		else if(membershipType == "constant client") {
			return maxBooks = 4;
		}
		return maxBooks;
	}
	
	// 2. encapsulation
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < firstName.length(); i++) {
			char c = firstName.charAt(i);
			if (Character.isAlphabetic(c)) {
				sb.append(c);
			} else {
				System.out.println("Please, introduce a valid character!");
			}
		}
		this.firstName = sb.toString();
	}
	
	public void setLastName(String lastName) {
		// objective: verify only alphabetic characters as parameters
		// 1) iterate over each character of the string parameter -> analyze each character -> if is correct, keep it 
		// 2) we need a structure that allows us to keep characters and when finish to iterate, then obtain the string;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < lastName.length(); i++) {
			char c = lastName.charAt(i); // access to the character in a string with charAt method 
			if(Character.isAlphabetic(c)) {
				sb.append(c);
			} else {
				System.out.println("Please, introduce a valid character!");
			}
		}
		this.lastName = sb.toString();
	}
	
}

