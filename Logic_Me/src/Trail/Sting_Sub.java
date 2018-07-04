package Trail;

class String_Level {
	public void meth() {
		

		String ab = "That is znmop";
		char[] ch = ab.toCharArray();

		String abc = "";
		String max = "", thismax;

		for (int j = 0; j < ch.length; j++) {

			// System.out.println(j + " " + ch[j]);
			bb: for (int i = j; i < ch.length; i++) {
				String temp = String.valueOf(ch[i]).toLowerCase();
				// System.out.println(temp);
				if (temp.equals(" ")) {
					abc += temp;

				} else if (abc.contains(temp)) {
					// System.out.println(temp);
					thismax = abc;
					abc = "";
					if (thismax.length() > max.length()) {
						max = thismax;
						break bb;
						// System.out.println(max);

					}

				} else {
					abc += temp;
					// System.out.println((j) + " " + abc);
				}

			}
		}
		// System.out.println(abc);
		System.out.println(max);

	}
}

public class Sting_Sub {
	public static void main(String[] args) {
		String_Level ob = new String_Level();
		ob.meth();

	}

}
