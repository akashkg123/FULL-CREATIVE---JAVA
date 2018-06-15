package Trail;

class A_Encapsulated {
	private String ab;

	public String getab() {
		return ab;

	}

	public void setab(String ab) {
		this.ab = ab;

	}

}

public class Encapsulation {

	public static void main(String[] args) {

		String c = "Akash";
		A_Encapsulated ob = new A_Encapsulated();
		ob.setab(c);

		System.out.println(ob.getab());

	}

}
