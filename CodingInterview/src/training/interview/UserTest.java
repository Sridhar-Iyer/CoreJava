package training.interview;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User("Sridhar", "Iyer", "M1559818");
		User user2 = new User("Sridhar", "Iyer", "M1559818");
		
		System.out.println(user1.equals(user2));
	}

}
