package Trail;

class Recursion {
	public int rec(int a) {
		if (a == 0) {
			return 1;
		}

		return (rec(a - 1) * a);

	}
}

public class RecursionProgram {

	public static void main(String[] args) {
		Recursion ob = new Recursion();
		System.out.println(ob.rec(5));

	}
}
