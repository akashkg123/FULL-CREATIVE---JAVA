package Trail;

class A_Reverse {
	public void meth() {
		int a[] = { 3, 1, 7, 2, 5 };
		int i;

		for (i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);

		}

	}
}

public class Array_Reverse {
	public static void main(String[] args) {
		A_Reverse ob = new A_Reverse();
		ob.meth();
	}

}
