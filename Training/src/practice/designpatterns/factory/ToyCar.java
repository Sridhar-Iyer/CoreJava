package practice.designpatterns.factory;

public class ToyCar implements Toy {
	
	private String color = null;
	private double price = 0.0;
	private String operation = null;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public ToyCar() {
		super();
	}
	public ToyCar(String color, double price, String operation) {
		super();
		this.color = color;
		this.price = price;
		this.operation = operation;
	}
	@Override
	public String toString() {
		return "ToyCar [color=" + color + ", price=$" + price + ", operation=" + operation + "]";
	}
	@Override
	public Toy buildToy() {
		ToyCar toyCar = new ToyCar();
		toyCar.setColor("RED");
		toyCar.setPrice(25.00);
		toyCar.setOperation("Battery");
		return toyCar;
	}
	public Toy buildToy(String color, double price, String operation) {
		ToyCar toyCar = new ToyCar(color, price, operation);
	    return toyCar;
	}
}
