package Trail;

class Fibonacci {

	public void fibo() {
		int f1 = 0, f2 = 1, fib = 0, i = 0;
		System.out.println(f1);
		System.out.println(f2);

		for (i = 0; i <= 5; i++) {
			fib = f1 + f2;
			System.out.println(fib);
			f1 = f2;
			f2 = fib;
		}

	}
}

public class FibonacciNumbers {
	public static void main(String[] args) {
		Fibonacci ob = new Fibonacci();// FIBONACCI
		ob.fibo();
	}

}
