package Trail;

interface Ione {
	void meth1();

	void meth2();

}

abstract class Aone implements Ione {
	public void meth1() {
		System.out.println("I am interface's FIRST method written in ABSTRACT class");

	}

	abstract public void Ameth();

	static void meth123() {
	}

}

abstract class Atwo extends Aone implements Ione {
	public void meth1() {
		System.out.println("I am interface's FIRST method written in ABSTRACT class");

	}

	abstract public void Ameth();

}

class Cone extends Aone {

	public void meth2() {
		System.out.println("I am remaining method in Interface!!");

	}

	public void Ameth() {
		System.out.println("I am OVERRIDED from ABSTRACT method!");

	}

}

class Ctwo {
	Aone ob = new Aone() {

		@Override
		public void meth2() {
			System.out.println("I am unexented ");
		}

		@Override
		public void Ameth() {
			// TODO Auto-generated method stub

		}
	};
}

public class Interface_Abstract {

	public static void main(String[] args) {
		Ione ob;
		ob = new Cone();
		ob.meth1();
		ob.meth2();

	}

}
