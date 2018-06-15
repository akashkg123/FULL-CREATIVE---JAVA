package Trail;

class A_ArrayL {
	public void meth() {

		int a[] = { 1, 2, 9, 4 };
		int i, large = 0;

		System.out.println("Class A - Size of an array: " + a.length);

		for (i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				large = a[i + 1];
			}

		}
		System.out.println("Class A - The FIRST LARGEST number is: " + large + "\n");

	}
}

class B_SecondLargest {
	public void meth() {

		int a[] = { 1, 2, 9, 8 };
		int i, large = 0, large2 = 0;

		System.out.println("Class B -Size of an array: " + a.length);

		for (i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				large = a[i + 1];
			}

		}
		System.out.println("Class B - The FIRST LARGEST number is: " + large);

		for (i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				if (a[i + 1] == large) {
					continue;
				}
			} else if (a[i] == large) {
				large2 = a[i + 1];

			}

		}
		System.out.println("Class B - The SECOND LARGEST number is: " + large2 + "\n");

	}
}

class C_OptimizedL {
	public void meth() {

		int a[] = { 1, 2, 9, 8 };
		int i, large = 0, large2 = 0;

		System.out.println("Class C - Size of an array: " + a.length);

		for (i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}

		}
		System.out.println("Class C - The FIRST LARGEST number is: " + large);

		for (i = 0; i < a.length; i++) {

			if (a[i] > large2) {
				if (a[i] != large) {
					large2 = a[i];

				}

			}

		}
		System.out.println("Class C - The SECOND LARGEST number is: " + large2 + "\n");
	}
}

public class Array_Largest {

	public static void main(String[] args) {

		/* Traditional way to find the largst number in an array */
		A_ArrayL ob = new A_ArrayL();
		ob.meth();

		/* Finding the second largest number in an array (Traditional way) */
		B_SecondLargest ob1 = new B_SecondLargest();
		ob1.meth();

		/*
		 * Finding the first and second largest numbers in an array by an optimized
		 * method
		 */
		C_OptimizedL ob2 = new C_OptimizedL();
		ob2.meth();

	}

}
