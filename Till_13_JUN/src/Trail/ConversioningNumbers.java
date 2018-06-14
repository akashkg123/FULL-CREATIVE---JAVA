package Trail;

class Conversion {
	public void con() {
		String s = "12";
		System.out.println(Integer.valueOf(s));

		double ab = 1.5;
		int ax = (int) ab;
		System.out.println(ax);

	}
}

public class ConversioningNumbers {

	public static void main(String[] args) {
		Conversion ob = new Conversion();
		ob.con();

	}
}
