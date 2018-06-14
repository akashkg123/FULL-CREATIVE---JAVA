package Trail;

class Palindrome {
	public void palin() {

		int a = 231, remainder = 0;
		String palin = " ";

		while (a != 0) {
			remainder = a % 10;
			a = a / 10;
			palin += remainder;

		}
		System.out.println(palin);

	}
}

public class PalindromeWord {

	public static void main(String[] args) {
		Palindrome ob = new Palindrome();
		ob.palin();

	}

}
