package Trail;

class A {
	A() {
		System.out.println("I am class A Constructor.");
	}

	int a = 10;
	String s = "K.G.";

	public void meth() {
		System.out.println("I am First class meth()");
	}

	public void meth(String s) { // Overloading

		this.meth();
		System.out.println(this.s + " I am First class meth(String s): Overloaded method but not overloaded!!");
	}

	public void generalmeth() {
		System.out.println("I am First class GENERAL method");
	}

}

class B extends A {

	int ab = 10;

	B() {
		System.out.println("I am class B Constructor.");
	}

	public void meth() { // OverRiding

		super.meth();
		System.out.println("I am Second class meth(): overrided method!!");
	}

	public void meth(String s) { // Overloading + OverRiding

		super.meth(s);
		System.out.println(s + " I am second class meth(String s): overrided method!!");
	}

}

class C extends B {
	C() {
		System.out.println("I am class C Constructor.");
	}

	public void akash() {
		meth();
		generalmeth();//
	}
}

class D extends A {
	public void example() {
		generalmeth();
		System.out.println("I am class D extended from class A: Example for Hierarchical Inheritance!!");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		/* Traditional type */
		A ob = new A();
		ob.meth("Kg.Akash!!");// Function call using this in same class
		
		System.out.println("OBJECT 1 EXECUTION COMPLETED");
		System.out.println();

		/* Single Inheritance with method Over riding */
		B ob1 = new B();
		ob1.meth();
		ob1.meth("akash...");
		System.out.println("OBJECT 2 EXECUTION COMPLETED");
		System.out.println();

		/* Calling a method from an extended's extended method!! */
		C ob2 = new C();
		ob2.akash();
		System.out.println("OBJECT 3 EXECUTION COMPLETED");
		System.out.println();
		
		/* An example for Hierarchical Inheritance*/
		D  ob3 = new D();
		ob3.example();
		System.out.println("OBJECT 4 EXECUTION COMPLETED");
		System.out.println();

	}

}
