package Trail;

class A_Trail implements Cloneable {
	
	public int meth() {
		System.out.println("ji");

		try

		{
			int a, b = 0;
			if (b != 1) {
				throw new Exception("Error");
			}

		} catch (Exception e) {
			//System.out.println("Got it");
			e.printStackTrace();
		}

		return 0;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// public void meth() {
	// int a[] = { 23, 45, 1, 7, 2 };
	// int i, j, k;
	//
	// for (i = 0; i < a.length - 1; i++) {
	// k = i;
	// for (j = i + 1; j < a.length; j++) {
	// if (a[j + 1] < a[j]) {
	// a[k] = a[j];
	// k = j;
	// }
	//
	// }
	//
	// for (int kj : a) {
	// System.out.println(a[kj]);
	// }
	//
	// }
	// }
}

class B {

	private static B instance = null;

	private B() {

		System.out.println("I am CREATED 1st TIME!!");

	}

	public static B getinstance() {
		if (instance == null) {
			instance = new B();
		} else {
			System.out.println("OBJECT IS CREATED ONLY ONCE");
		}
		return instance;

	}

}

public class Sort implements Cloneable {
	
	

	public static void main(String[] args) throws Exception {
		
		
		

		try

		{
			int a, b = 0;
			if (b != 1) {
				throw new Exception("Error");
			}

		} catch (Exception e) {
			//System.out.println("Got it");
			e.printStackTrace();
		}
//
//		A_Trail ob = new A_Trail();
//		ob.meth();

	}

}
