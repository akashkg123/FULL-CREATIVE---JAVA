package Trail;

class PalindromeN {
	public void palin() {

		int a = 231, remainder = 0;
		// String palin = " ";
		int palin = 0;

		while (a != 0) {
			remainder = a % 10;
			a = a / 10;
			palin = palin * 10 + remainder;

		}
		System.out.println(palin);

	}
}

public class PalindromeNumbers {
	public static void main(String[] args) {

		PalindromeN ob = new PalindromeN();
		ob.palin();

	}

}
