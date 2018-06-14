package Trail;

class Ab {
	public int abc() {
		int a = 10, b = 5;
		return a + b;

	}

	public String abc(String ab) {
		return ab;
	}
}

class Bc extends Ab {
	public int abc() {
		int a = 10, b = 5;

		return a + b;

	}
}

public class Possibilites {
	Bc ob = new Bc();
	int a= ob.abc();

}
