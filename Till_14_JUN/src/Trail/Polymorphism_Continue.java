package Trail;

class A_Poly1 {
	int a = 0;

	A_Poly1() {

		++a;
		System.out.println(a);

	}

	public void meth() {
		System.out.println("I am FIRST class GENERAL method!");
	}

}

class B_Poly1 extends A_Poly1 {
	int b = 0;

	B_Poly1() {

		++b;
		System.out.println(b);

	}

}

class C_Poly1 extends A_Poly1 {
	int c = 0;

	C_Poly1() {

		++c;
		System.out.println(c);

	}

}

class D_Poly1 extends A_Poly1 {
	D_Poly1(int a) {

	}

}

public class Polymorphism_Continue {

	public static void main(String[] args) {
		A_Poly1 ob = new A_Poly1();
		ob.meth();
		ob = new A_Poly1();
		ob = new B_Poly1();
		ob = new C_Poly1();

		ob = new A_Poly1();
		ob = new B_Poly1();
		ob = new C_Poly1();

	}

}
