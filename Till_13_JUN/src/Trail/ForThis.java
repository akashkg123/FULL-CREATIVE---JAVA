package Trail;

class Base {
	Base() {
		System.out.println("HI");
	}

	Base(int a) {
		this();// This with constructor.
	}

	public void method1() {
		System.out.println("I am method");
	}

	public void method2() {
		this.method1();// This with method.

	}

}

class Child extends Base {
	public void method() {
		method1();// This with method.
		

	}

}

public class ForThis {
	public static void main(String[] args) {
		Base ob = new Base();
		new Base(1);
		ob.method2();

	}

}
