package Trail;

class Sort {
	public void sorting() {
		int a[] = { 2, 1, 5, 3, 3, 3, 6, 1, 7 };
		int i, j, sort;
		System.out.println(a.length + " : Total\n");

		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j <= a.length - 1; j++) {
				if (a[i] < a[j]) {
					sort = a[j];
					a[j] = a[i];
					a[i] = sort;

				}

			}
		}

		for (i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
		System.out.println("\n");

		/**********************************************************
		 **********************************************************/

		System.out.println("COUNT CODE OUTPUT\n\n");

		for (i = 0; i < a.length - 1; i++) {
			// System.out.println("I");
			int counter = 1;
			for (j = i + 1; j <= a.length - 1; j++) {
				// System.out.println("j");

				if (i == 0) {
					// System.out.println("1ST IN");

					if (a[i] == a[j]) {

						++counter;
						//System.out.println(a[i] + " - " + counter + " time(s)");
					} else {
						//System.out.println(a[i] + " - " + counter + " time(s)");
					}
				} else if (a[i] != a[i - 1]) {
					// System.out.println(a[i - 1] + " CONDITION " + a[j]);

					if (a[i] == a[j]) {
						System.out.println("NAN DHA");
						// System.out.println(a[i] + a[i + 1]);
						++counter;
						//System.out.println(a[i] + " - " + counter + " time(s)");
					} else {
						//System.out.println(a[i] + " - " + counter + " time(s)");
					}
				}
			}
			 System.out.println(a[i] + " - " + counter + " time(s)");
		}

	}

}

public class Array_Count {

	public static void main(String[] args) {

		Sort ob = new Sort();
		ob.sorting();

	}

}
