package Trail;

interface Interface_One {
	void Interface_meth();

	void Interface_Trailmeth();

	default void meth_Default() {
		System.out.println("I am DEFAULT METHOD in INTERFACE");

	}

	static void Interface_Static_meth() {
		System.out.println("I am STATIC method in INTERFACE");
	}
}

class A implements Interface_One {

	public void Interface_Trailmeth() {

	}

	public void Interface_meth() {

	}

	public void a_general() {
		System.out.println("I am first class GENERAL METHOD!!");
	}

}

class B extends A implements Interface_One {

	public void Interface_meth() {

	}

	public void Interface_Trailmeth() {
		super.a_general();

	}

}

public class Interface_Example {

	public static void main(String[] args) {

		A ob;
		ob = new A();
		ob.a_general();
		ob.meth_Default();

		Interface_One.Interface_Static_meth();
	}

}
