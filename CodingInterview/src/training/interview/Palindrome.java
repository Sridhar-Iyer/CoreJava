package training.interview;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(new Palindrome().isPanlindrome("abcdecba"));
		System.out.println(new Palindrome().isPanlindrome("abcdcba"));
		System.out.print(new Palindrome().isPanlindrome("ab"));
	}

	public boolean isPanlindrome(String word) {
		int wordLength = word.length();
		for (int i = 0; i < wordLength / 2; i++) {
			if (word.charAt(i) != word.charAt(wordLength - i - 1))
				return false;
		}
		return true;
	}
}
