package Trail;

import java.util.Scanner;

class Real_Base {
	public void meth() {

		String aadhar;
		System.out.println("Enter the Aadhar Number: ");
		Scanner sc = new Scanner(System.in);
		aadhar = sc.nextLine();

		String dupe = "";
		long aadharFinal;
		// System.out.println(aadhar.length());

		String aadhar1 = aadhar.replaceAll("[A-z]", " ");
		// System.out.println("Entered: " + aadhar1);
		// System.out.println("hi" + aadhar1.length());

		if (aadhar.length() == 12 || aadhar.length() == 14 || aadhar.length() == 13) {
			// System.out.println("18");

			String[] ab = aadhar1.split(" ");

			for (int i = 0; i < ab.length; i++) {
				// System.out.println("23");

				dupe += ab[i];

			}
			if (dupe.length() == 12) {
				// System.out.println("30");

				aadharFinal = Long.valueOf(dupe);
				System.out.println("your Aadhar card is VALID and your number is: " + aadharFinal);

			} else {
				System.out.println("Invalid Aadhar number.");
			}
		} else {
			System.out.println("Only 12 digit NUMBERS are allowed.");
		}
		sc.close();

		// ArrayList al = new ArrayList();

	}

}

public class Real {
	public static void main(String[] args) {
		Real_Base ob = new Real_Base();
		ob.meth();

	}

}
