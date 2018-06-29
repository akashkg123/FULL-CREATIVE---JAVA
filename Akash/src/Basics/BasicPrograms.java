package Basics;

interface Akash {
	// int a = 10;

	public void One(int a);

	static void akash123() {
		int a = 0;
		++a;
		System.out.println("Till Now: " + a);
		
		System.out.println("HI");
	}
}

class Akashkg implements Akash {
	int a = 1;

	public void One(int a) {
		System.out.println(this.a);

		Akash.akash123();

	}

}

class Akashkg1 implements Akash {

	@Override
	public void One(int a) {
		// TODO Auto-generated method stub
		Akash.akash123();
	}
	

	

}

class Fibonacci {

	int a = 123;

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

class Armstrong {
	public void arm() {
		int n = 371;
		int arm = 0, remainder, divide, cube, copy;
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

class Conversion {
	public void con() {
		String s = "12";
		System.out.println(Integer.valueOf(s));

		double ab = 1.5;
		int ax = (int) ab;
		System.out.println(ax);

	}
}

class Recursion {
	public int rec(int a) {
		if (a == 0) {
			return 1;
		}

		return (rec(a - 1) * a);

	}
}

class Palindrome {
	public void palin() {

		int a = 231, remainder = 0;
		String palin = " ";

		while (a != 0) {
			remainder = a % 10;
			a = a / 10;
			palin += remainder;

		}
		System.out.println(palin);

	}
}

class PalindromeN {
	public void palin() {

		int a = 231, remainder = 0;
		// String palin = " ";
		int palin = 0;

		while (a != 0) {
			remainder = a % 10;
			a = a / 10;
			palin = palin * 10 + remainder;

		}
		System.out.println(palin);

	}
}

class ConstructorThis {
	ConstructorThis() {
		this.conthis();
	}

	public void conthis() {
		System.out.println("I was called by the constructor!!");

	}

}

class TrailMe {
	public static void hero() {
		System.out.println("HI");
	}
}

public class BasicPrograms {

	Fibonacci fib = new Fibonacci();
	// fib.a = 1111;

	public static void main(String[] args) {

		BasicPrograms bp = new BasicPrograms();
		bp.main();

		// Fibonacci fib = new Fibonacci();// FIBONACCI
		// fib.fibo();
		// System.out.println();
		//
		// Prime pri = new Prime();// Prime
		// pri.pri();
		// System.out.println();
		//
		// Armstrong arm = new Armstrong();
		// arm.arm();
		// System.out.println();
		//
		// Conversion con = new Conversion();
		// con.con();
		// System.out.println();

		// Recursion rec = new Recursion();
		// System.out.println( rec.rec(5) );
		// System.out.println();

		// Palindrome palin = new Palindrome();
		// palin.palin();
		// System.out.println();
		//
		// PalindromeN palin1 = new PalindromeN();
		// palin1.palin();
		// System.out.println();

		// ConstructorThis conthis = new ConstructorThis();
		// conthis.conthis();
		// System.out.println();

		Akashkg abc = new Akashkg();
		abc.One(6);
		
		Akashkg1 abc1 = new Akashkg1();
		abc1.One(6);

	}

	public void main() {
		System.out.println(fib.a);
	}

}
