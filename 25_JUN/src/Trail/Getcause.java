package Trail;

class A_Try {
	public void meth() throws myexception {
		int a = 11;
		try {
			if (a != 0) {

				throw new myexception("Aiaioooo");
			}

		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}

class myexception extends Throwable {
	public myexception(String str) {
		super(str);

	}

}

public class Getcause {

	public static void main(String[] args) throws myexception {
		A_Try ob = new A_Try();
		ob.meth();

	}

}
