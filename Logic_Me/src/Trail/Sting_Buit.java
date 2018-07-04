package Trail;

class CapLetter {
	public void meth() {
		String a = "hello everybody, chennai ";

		String ab[] = a.split(" ");
		String finals = "";

		for (int i = 0; i < ab.length; i++) {
			// String.valueOf(ab[i].charAt(0)).toUpperCase();
			// finals += ab[i];
			// System.out.println(ab[2]);
			char ch[] = ab[i].toCharArray();
			// System.out.println(ch);
			String temp = String.valueOf(ch[0]).toUpperCase();
			finals += temp;

			for (int j = 1; j < ch.length; j++) {
				// System.out.println(ch[j]);
				finals += String.valueOf(ch[j]);

			}
			finals += " ";

		}
		System.out.println(finals);

	}
}

public class Sting_Buit {
	public static void main(String[] args) {
		CapLetter ob = new CapLetter();
		ob.meth();

	}

}
