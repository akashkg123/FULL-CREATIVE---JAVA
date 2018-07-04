package Trail;

import java.util.Scanner;

class A_Srini {
	public void sweet() {
		String a = "helloell well";
		String find = "he";

		char[] ch1 = find.toCharArray();
		System.out.println(ch1.length);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String[] ab = a.split("\\s");

		// Into Words*********************************************************
		for (String i : ab) {
			// System.out.println(i);

			// Into Characters*************************************************
			char abc[] = i.toCharArray();
			int temp = 0;
			int k = 0;

			// Loop for Input into Words***************************************
			for (int j = temp; j < abc.length; j++) {
				j = temp;
				// System.out.println(abc[j]);
				int m = 0;

				if (abc[j] == ch1[m]) {
					// System.out.println("Mathching 29");
					for (k = j + 1; k < ch1.length + j; k++) {
						// System.out.println("Mathching 29:31");

						if (abc[k] == ch1[++m]) {
							System.out.println("check");
							// System.out.println("Mathching 29:31:35");

						} else {
							// System.out.println(abc[temp]);

						}

					}

				} else {
					System.out.print(abc[j]);
				}
				// System.out.println("I am K: " + k);
				temp = k;
				// System.out.println("I am temp: " + temp);

			}

		}
		sc.close();

	}
}

public class MainClass {

	public static void main(String[] args) {
		final A_Srini ob = new A_Srini();
		ob.sweet();

		ob.sweet();
	}

}