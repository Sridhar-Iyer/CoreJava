package training.interview;

import java.util.Objects;

public class User {

	private String firstName;
	private String lastName;
	private String uniqueId;

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

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public User(String firstName, String lastName, String uniqueId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.uniqueId = uniqueId;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof User))
			return false;
		User user = (User) o;
		//return user.firstName.equals(firstName) && user.lastName.equals(lastName) && user.uniqueId.equals(uniqueId);
		return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(uniqueId, user.uniqueId);
	}
	
	public int hashCode() {
		/*int result = 17;
		result = 31 * result + firstName.hashCode();
		result = 31 * result + lastName.hashCode();
		result = 31 * result + uniqueId.hashCode();
		return result;*/
		return Objects.hash(firstName,lastName,uniqueId);
	}
}
