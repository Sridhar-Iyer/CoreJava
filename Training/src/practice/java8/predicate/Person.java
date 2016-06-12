package practice.java8.predicate;

public class Person {

	private String name;
	private String gender;
	private String maritalStatus;
	private String employmentStatus;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public Person(String name, String gender, String maritalStatus, String employmentStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.employmentStatus = employmentStatus;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", maritalStatus=" + maritalStatus
				+ ", employmentStatus=" + employmentStatus + "]";
	}
	
}
