package practice.designpatterns.factory;

public class Factory {

	public static void main(String[] args) {
		Toy car = ToyFactory.makeToy("CAR");
		System.out.println(car);
	}

}
