package Online;

interface Akash {
	static void meth() {
		System.out.println("I am  Static method in abstract classs!!");

	}

	public abstract void eat();
}

class A_Chennai {
	public void meth() {
		System.out.println("Hi");

	}
}

public class Trail {

	public static void main(String[] args) {
		System.out.println("I am main method");

		// StringBuffer sb = new StringBuffer();
		// sb.append("Akash");
		// sb.append("Joel");

		// Akash.meth();
		Akash ob = () -> {

			System.out.println("I am Eat");

		};
		ob.eat();
		A_Chennai ob1 = new A_Chennai();

		new Thread() {
			public void run() {
				ob1.meth();
			}

		}.start();
	}
}
