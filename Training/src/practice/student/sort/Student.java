package practice.student.sort;

public class Student   {

	private Integer studentNumber;
	private String firstName;
	private String lastName;
	private Integer rank;
	private Integer grade;
	private Integer age;
	
	public Integer getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
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
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student() {
		super();
	}
	public Student(Integer studentNumber, String firstName, String lastName, Integer rank, Integer grade, Integer age) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rank = rank;
		this.grade = grade;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", rank=" + rank + ", grade=" + grade + ", age=" + age + ", getStudentNumber()=" + getStudentNumber()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getRank()=" + getRank()
				+ ", getGrade()=" + getGrade() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
