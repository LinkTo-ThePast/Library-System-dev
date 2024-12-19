package membership;

import java.util.Arrays;


public class Membership {
	
	// attributes: ---> basic info for clients/readers
	private String firstName;
	private String lastName;
	private String email;
	private int id;
	private int age;
	private String membershipType;
	 
	
	// methods:

	// 1. retrieve a book or books from the library;
	
	public int bookToRead() {
		int maxBooks = 0; // --> initialize variable, then return, not define again;
		if(membershipType == "standard") {
			return maxBooks = 2;
		}
		else if(membershipType == "student") {
			return maxBooks = 3;
		}
		else if(membershipType == "premium") {
			return maxBooks = 4;
		}
		
		else {
			System.out.print("You're not a valid member of the library");
		}
		return maxBooks;
	}
	
	// 2. encapsulation
	public String getFirstName() {
		return this.firstName;
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
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setAge(int age) {
		if(age > 10) {
			this.age = age;
		}
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId() {
		
	}
	public String getMembershipType() {
		return this.membershipType;
	}
	
	public void setMembershipType(String membershipType) {
		if(membershipType.equals("standard")) {
			this.membershipType = "standard";
		}
		else if(membershipType.equals("student")) {
			this.membershipType = "student";
		}
		else if(membershipType.equals("premium")) {
			this.membershipType = "premium";
		}
		else {
			System.out.println("Please, introduce a valid membership type!");
		}
	}
	
	// constructor
	public Membership(String firstName, String lastName, String email, int age, String membershipType) {
		firstName = this.firstName;
		lastName = this.lastName;
		email = this.email;
		age = this.age;
		membershipType = this.membershipType;
	}
}	

