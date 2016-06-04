package practice.generics;

import practice.student.sort.Student;

/**
 * @author Sridhar
 *
 * @param <T>
 */
public class Vehicle<T> {
	
	private T type;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}
	
	public static void main(String[] args) {
		Vehicle<String> vehicle = new Vehicle<String>();
		Vehicle<Student> studentVehicle = new Vehicle<Student>();
		vehicle.setType("CAR");
		System.out.println(vehicle.getType());
		studentVehicle.setType(new Student());
		System.out.println(studentVehicle.getType());
	}	

}
