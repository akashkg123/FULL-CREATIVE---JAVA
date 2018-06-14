package Trail;

class A_Poly {
	static int a = 10;

	public void meth() {
		System.out.println("I am FIRST class METHOD");
	}

	public void meth(String ab) {

		System.out.println("I am FIRST class METHOD: " + ab);

	}

}

class B_Poly extends A_Poly {

	public void meth(String ab) {
		System.out.println("I am SECOND class METHOD: " + ab);

	}

}

public class Polymorphism {
	public static void main(String[] args) {

		A_Poly ob = new A_Poly();
		ob.meth("OVERLOADED");

		B_Poly ob1 = new B_Poly();
		ob1.meth("OVERRIDED");

		/* Upcasting */
		A_Poly ob2 = new B_Poly();
		ob2.meth();
		

		new A_Poly();
		System.out.println(A_Poly.a);

	}

}
