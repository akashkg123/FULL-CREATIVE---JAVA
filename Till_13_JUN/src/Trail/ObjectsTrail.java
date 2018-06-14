package Trail;

class Objects {
	int a = 123;

	Objects() {
		System.out.println("I am constructor");
		
	}

	public void obj(int ab) {

		System.out.println("Hello I am method!" + ab);

	}
}

public class ObjectsTrail {

	public static void main(String[] args) {
		Objects ob = new Objects(); // Initialization through Constructor.
		ob.obj(5);// Initialization through Method.
		System.out.println(ob.a = 11);// Initialization through Reference.

	}

}
