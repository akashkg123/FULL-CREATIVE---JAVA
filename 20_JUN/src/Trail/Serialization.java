package Trail;

import java.io.PrintWriter;
import java.io.Serializable;

class A_Serialization implements Serializable {

}

class B {
	final int a;

	B() {
		a = 1;
		System.out.println("I am I Constructor!!" + a);

	}

	B(int b) {
		a = 34;
		System.out.println("I am II Constructor!!" + a);

	}

	void meth() {
		System.out.println("I am I meth!!" + a);
	}
}

public class Serialization {
	public static void main(String[] args) {

		B ob = new B(10);
		new B();
		ob.meth();

	}
}
