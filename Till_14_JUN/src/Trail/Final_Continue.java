package Trail;

final class A_Final {
	/*
	 * A final variable can be declared as static and it can be initialized in the
	 * static block
	 */

	static final int a;
	static {
		a = 10;
	}

	public void general(final String ab) {
		System.out.println(ab);
		System.out.println(ab.concat(" kg"));

		/*
		 * final variable cannot change even if its sent as an argument to amethod ab =
		 * ab.concat("gopi");
		 */

		String ac = ab.concat(" ji");
		System.out.println(ac);
	}

}

public class Final_Continue {
	public static void main(String[] args) {
		A_Final ob = new A_Final();
		ob.general("Akash");

	}

}
