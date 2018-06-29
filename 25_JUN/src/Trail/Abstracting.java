package Trail;

interface akash1 {
	public void method();
}

abstract class ab {
	public void meth() {
		System.out.println("I am ABSTRACT CLASSS Normal Method");
	}

	abstract void meth1();

}

class AB_Abstract extends ab implements akash1 {

	@Override
	void meth1() {
		System.out.println("extended");

	}

	@Override
	public void method() {
		System.out.println("I am INTERFACE METHOD");

	}

}

public class Abstracting {

	public static void main(String[] args) {
		AB_Abstract ob = new AB_Abstract();
		System.out.println(ob instanceof AB_Abstract);
		ob.meth();
		System.out.println("I am below return 1");
		
		
		

	}

}
