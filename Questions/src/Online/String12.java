package Online;

class Joel {
	public void meth() {
		String a = "akashaaa";
		char[] ab = a.toCharArray();
		int i = 0, j = 0;
		String sb = "";

		for (i = 0; i < ab.length; i++) {
			int counter = 0;
			String in = String.valueOf(ab[i]);
			for (j = 0; j < ab.length; j++) {
				{

					if (sb.contains(in)) {
						// System.out.println(in);

					} else {
						if (ab[i] == ab[j]) {
							++counter;
						}
					}
				}

			}
			sb += (ab[i]);
			if (counter != 0) {
				System.out.println(ab[i] + " " + counter);
			}
		}

	}
}

public class String12 {
	public static void main(String[] args) {
		Joel ob = new Joel();
		ob.meth();

	}

}
