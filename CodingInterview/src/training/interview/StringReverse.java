package training.interview;

public class StringReverse {

	public static String reverse(String string) {
		if (string.length() < 2) {
			return string;
		}
		return reverse(string.substring(1)) + string.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
	}
}