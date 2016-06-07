package practice.designpatterns.factory;

public class ToyFactory {
	
	public static Toy makeToy(String type) {
		
		if(type.equalsIgnoreCase("CAR")) {
			return new ToyCar().buildToy();
		}
		throw new IllegalArgumentException("No such toy");	
	}
}
