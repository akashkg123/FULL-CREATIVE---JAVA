package Trail;

class A_ObjectClone {

	public void meth() {
		System.out.println("I am GENERAL method");
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}

public class Object_Cloning {
	;

	public static void main(String[] args) {

		A_ObjectClone ob = new A_ObjectClone();
		ob.meth();

	}

}
