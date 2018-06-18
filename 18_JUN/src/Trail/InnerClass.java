package Trail;

//Testing
/*interface akash {
	interface kg {
		class Akash {
			void j() {
				System.out.println("jgjcyty");
			}
		}
	}
}

class other{
	interface akakaka{
		
	}
}*/

abstract class One {
	abstract void yellow();
}

class Outer {
	class Inner {
		public void meth() {
			System.out.println("Welcome to INNER class");
		}
	}
}

class Outer1 {
	class Inner extends Outer {// Member Inner class
		public void meth() {
			class Ab {// local inner class

			}
		}

	}
}

public class InnerClass {

	public static void main(String[] args) {

		Outer ob = new Outer();
		Outer.Inner ob1 = ob.new Inner();
		ob1.meth();

		One ob2 = new One() { // Anonymous class

			@Override
			void yellow() {
				System.out.println("Hello");

			}
		};
		ob2.yellow();

	}

}
