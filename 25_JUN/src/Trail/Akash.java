package Trail;

import java.lang.reflect.Method;

class AkashA {
	static int a = 0;

	public AkashA() {
		System.out.println("I am normal constructor and before changing the value of a: " + a);
	}

	public AkashA(int a) {
		this.a = a;
		System.out.println("I am parameterized constructorand after changing the value of a: " + a);

	} 

	public void meth() {
		System.out.println("The value of a inside a method: " + a);

	}

}

public class Akash {

	public static void main(String[] args) {
		// AkashA ob = new AkashA();
		// ob.a = 10;
		// System.out.println("before change " + ob.a);
		//
		// ob = new AkashA();
		// System.out.println("after change " + ob.a);

		AkashA ob = new AkashA();
		ob = new AkashA(5);
		ob.meth();
		System.out.println("Break");
		ob = new AkashA();
		ob.meth();

	}

}