package Trail;

import java.util.Arrays;

class Split {
	public void Spliting() {
		String tocap = "i am           akash";
		String[] split2cap = tocap.split("\\s+");
		// System.out.println(Arrays.toString(split2cap));

		for (String x : split2cap) {
			System.out.println(x);

		}

	}

}

class Capitalize {
	public void capital() {
		String tocap = "i am           akash";
		String[] split2cap = tocap.split("\\s");
		String caps = "";
		for (String x : split2cap) {
			String first = x.substring(0, 1);

			String remaining = x.substring(1);
			caps += first.toUpperCase() + remaining + " ";
		}
		System.out.println(caps);

	}
}

class EachWord_Reverse {
	public void eachWreverse() {
		String sentence = "I am ";
		String[] convert = sentence.split(" \\s ");
		// System.out.println(Arrays.toString(convert));
		String afterconvertion = "";

		for (String x : convert) {

			StringBuffer sb = new StringBuffer(x);
			afterconvertion += (sb.reverse()) + " ";
		}
		System.out.println(afterconvertion);

	}
}

class String_Immutable {

	public void immutable() {
		String s1 = "akash";
		String s2 = "akash";

		s1.concat("kg");
		System.out.println(s1);

		s1 = s1.concat("kg");
		System.out.println(s1);
		// System.out.println("iam akash " + (s1==s2));

	}
}

class Swap_String {
	public void swap() {
		String s1 = "akash";
		String s2 = "kg";

		s1 = s1 + s2;
		s2 = s1.substring(0, (s1.length() - s2.length()));
		s1 = s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);

		// DOUBT
		/*
		 * int a = 1; int[] ab = new int[a];
		 * 
		 * for (int i = 0; i <= a; i++) { if (a == 20) { break; } else { ab[a] = i;
		 * 
		 * } a++; System.out.println(ab);
		 * 
		 * }
		 */

	}

}

public class String_Faqs {

	public static void main(String[] args) {
		Split ob = new Split();
		ob.Spliting();

		// Capitalize ob = new Capitalize();
		// ob.capital();
		//
		// EachWord_Reverse ob1 = new EachWord_Reverse();
		// ob1.eachWreverse();
		//
		// String_Immutable ob2 = new String_Immutable();
		// ob2.immutable();

		// Swap_String ob3 = new Swap_String();
		// ob3.swap();

	}

}
