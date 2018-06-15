package Trail;

import java.util.Scanner;

class A_Shift {
	public void meth() {
		Scanner sc = new Scanner(System.in);
		int a[] = { 3, 1, 7, 2, 5 };
		int i, shift;
		System.out.println(a.length);

		System.out.println("Enter the Number of digits to be Shifted to left");
		shift = sc.nextInt();

		System.out.println("\n The output is:");

		for (i = a[shift + 1]; i <= a.length - 1; i++) {
			System.out.println(a[i]);

		}
		for (i = 0; i <= shift - 1; i++) {
			System.out.println(a[i]);
		}
		sc.close();

	}

}

public class Array_Shift {

	public static void main(String[] args) {

		/*
		 * INPUT = { 3,1,7,2,5},REQUIRED OUTPUT IS {7,2,5,3,1}!!! If shift value is 2
		 * then, after two number the rest of the numbers should come at the front then
		 * the remaining should be in the same order as declared!!
		 */

		A_Shift ob = new A_Shift();
		ob.meth();

	}

}
