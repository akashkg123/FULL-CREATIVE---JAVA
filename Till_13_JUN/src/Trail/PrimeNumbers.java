package Trail;

class Prime {
	public void pri() {

		int n = 2, c = 0, i;
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 0) {
			System.out.println("It is a PRIME Number");
		} else {
			System.out.println("It is NOT a PRIME Number");
		}

	}
}

public class PrimeNumbers {
	public static void main(String[] args) {
		Prime ob = new Prime();// Prime
		ob.pri();

	}

}
