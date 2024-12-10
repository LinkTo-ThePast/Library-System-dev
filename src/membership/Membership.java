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
	
}

