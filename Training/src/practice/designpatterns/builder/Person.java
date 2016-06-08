package practice.designpatterns.builder;

public class Person {
	
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private Person(AddressBook addressBook) {
		this.firstName = addressBook.firstName;
		this.lastName = addressBook.lastName;
		this.phone = addressBook.phone;
		this.address = addressBook.address;		
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
	public static class AddressBook {
		
		private String firstName;
		private String lastName;
		private String phone;
		private String address;
		
		public AddressBook(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public AddressBook addPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public AddressBook addAddress(String address) {
			this.address = address;
			return this;
		}
		public Person build() {
			Person person = new Person(this);
			return person;
		}
		
	}
}
