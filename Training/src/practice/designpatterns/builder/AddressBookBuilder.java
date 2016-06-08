package practice.designpatterns.builder;

public class AddressBookBuilder {
	
	public static void main(String[] args) {
		
		Person sridhar = new Person.AddressBook("Sridhar", "Iyer").build();
		System.out.println(sridhar);
		
		Person santosh = new Person.AddressBook("Santosh", "Benna")
				.addPhone("892-876-6785")
				.addAddress("Jersey City, NY")
				.build();
		System.out.println(santosh);
	}

}
