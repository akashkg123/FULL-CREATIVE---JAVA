package Trail;

abstract class Abs {

	abstract public void meth();

	abstract public void meth2();
	
	

	public void general_Method() {
		System.out.println("I am GENERAL METHOD");
	}

}

class A_Abstract extends Abs {

	public void meth() {
		System.out.println("I am class A_Abstract overrided method!");
		super.general_Method();
	}

	public void meth2() {

	}

}

class B_Abstract extends Abs {

	public void meth() {
		System.out.println("I am class A_Abstract overrided method!");
		super.general_Method();
	}

	public void meth2() {

	}

}

public class Abstract_Example {

	public static void main(String[] args) {
		Abs ob;
		ob = new B_Abstract();
		ob.meth();

	}

}
