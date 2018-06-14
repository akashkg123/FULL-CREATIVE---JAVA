package Trail;

class Armstrong {
	public void arm() {
		int n = 371;
		int arm = 0, remainder = 0, cube = 0, copy = 0;
		copy = n;

		while (n > 0) {
			remainder = n % 10;
			// System.out.println(remainder);
			n = n / 10;
			// System.out.println(n);
			cube = (remainder * remainder * remainder);
			// System.out.println(cube);
			arm += cube;
			// System.out.println(arm);
		}

		System.out.println(arm);
		if (arm == copy) {
			System.out.println("It is an Armstrong number");
		} else {
			System.out.println("It is not a Armstrong Number");
		}
	}

}

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Armstrong ob = new Armstrong();
		ob.arm();

	}

}
