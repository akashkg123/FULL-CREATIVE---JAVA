package Trail;

class A_Final {
	final int a = 10;
	/*
	 * A Final variable can be declared without initialization but you should
	 * initialize it in constructor.
	 */
	final int abc;
	static int ab = 12;

	A_Final() {
		abc = 1234;
	}

	public final void final_meth() {
		System.out.println(a);
		System.out.println(ab);

		/*
		 * Inside a final method static variables can be used but no static variable can
		 * be created!..... static ab = 10;
		 */

	}

	public final void final_meth(int ab) {

		/*
		 * Calling the first method and printing the static variable in method two and
		 * also checked the property of static works or not
		 */

		final_meth();
		System.out.println(A_Final.ab + 1);
		System.out.println(A_Final.ab + 1);
	}
}

final class B_Final extends A_Final {
	public void general_method() {

		super.final_meth();
		int a = 1;
		System.out.println(a);

	}

	/*
	 * A final method cannot be overrided but it can be extended public final void
	 * final_meth() {
	 * 
	 * 
	 * }
	 */

}

public class Final {
	public static void main(String[] args) {

		/* Calling a overloaded method with argument */
		A_Final ob = new A_Final();
		ob.final_meth(5);

		/*
		 * A final variable cannot be changed for ever!..... System.out.println(ob.a =
		 * 10);
		 */

		B_Final ob1 = new B_Final();
		ob1.general_method();

	}

}
