package practice.designpatterns.singleton;

public class SingletonInstantiator {
	
	public static void main(String[] args) {
		
		Singleton mySingleton1 = Singleton.getInstance();
		Singleton mySingleton2 = Singleton.getInstance();
		
		System.out.println(mySingleton1);
		System.out.println(mySingleton2);
	}

}
