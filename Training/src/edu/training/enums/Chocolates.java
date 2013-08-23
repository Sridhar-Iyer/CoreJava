package edu.training.enums;

enum Chocolate {
	
	DairyMilk(50),
	KitKat(20),
	Munch(10),
	Perk(5);
	
	int price = 0;
	
	Chocolate(int price) {
		this.price = price; 
	}
}

public class Chocolates {

	public static void main(String[] args) {
		
		Chocolate favouriteChocolate = Chocolate.DairyMilk;
		
		switch(favouriteChocolate) {
		
		case DairyMilk: 
			
			System.out.println("My Favourite Chocolate is " + favouriteChocolate + " and its price is " + favouriteChocolate.price + " ruppes");
			break;
			
		case KitKat: 
			
			System.out.println("My Favourite Chocolate is " + favouriteChocolate + " and its price is " + favouriteChocolate.price + " ruppes");
			break;
		
		case Munch: 
	
			System.out.println("My Favourite Chocolate is " + favouriteChocolate + " and its price is " + favouriteChocolate.price + " ruppes");
			break;

		}

	}

}
