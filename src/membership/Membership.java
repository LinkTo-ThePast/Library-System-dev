package membership;

import java.util.Arrays;

public class Membership {
	
	// attributes: ---> basic info for clients/readers
	private static String firstName;
	private static String lastName;
	private static String email;
	private static int age;
	private String membershipType;
	 
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
}

