package Trail;

class A_Sort {
	public void meth() {
		int a[] = { 3, 1, 7, 2, 5 };
		int i = 0, swap, j = 0;

		for (i = 0; i < a.length - 1; i++) {
			for (j = i+1; j < a.length; j++) {
				if (a[i] < a[j]) {
					swap = a[i];
					a[i] = a[j];
					a[j] = swap;

				}

			}
		}
		System.out.println();

		for (i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
		}

	}
}

public class Array_Sort {
	public static void main(String[] args) {
		A_Sort ob = new A_Sort();
		ob.meth();
	}

}
