package Trail;

class A_Exception {
	public void meth() throws Exception {
		int a = 0;

		int j = a;
		try {
			if (j < 18) {
				throw new Exception("Akash Exception");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		// System.out.println("\n" + a + " " + b);

		finally {
			System.out.println("hi all");
		}

	}
}

public class Exception_Handling {
	public static void main(String[] args) throws Exception {
		A_Exception ob = new A_Exception();
		System.out.println("I am gonna exit bye.");
		System.exit(0);
		ob.meth();

	}

}
