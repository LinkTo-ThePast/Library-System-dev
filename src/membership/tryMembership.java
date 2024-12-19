package membership;

public class tryMembership {
	
	public static void main(String[] args) {
		Membership personExample = new Membership("Fuuka", "Yamagashi", "email@example", 16, "student");
		personExample.setAge(17);
		personExample.setFirstName("Fuuka");
		personExample.setMembershipType("student");
		System.out.print("The name of the new member is: " + personExample.getFirstName() + ". Type of membership: " + personExample.getMembershipType());
		System.out.println(personExample.getFirstName() + "can borrow a maximum of " + personExample.bookToRead() + " books!");
	}
}
