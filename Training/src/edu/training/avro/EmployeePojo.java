package edu.learning.avro;

public class EmployeePojo {
	
	private int id;
	private String name;
	private double salary;
	private String address;
	private int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public EmployeePojo(int id, String name, double salary, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.age = age;
	}
	
	public EmployeePojo() {
		super();
	}
	
}
