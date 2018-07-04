package Trail;

import java.util.Scanner;

class A_String {
	public void meth() {

		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);

		String a;
		a = sc.nextLine();

		char[] ch = a.toCharArray();
		String finals = "";
		for (int i = 0; i < ch.length; i++) {
			if (i == 0) {
				finals = String.valueOf(ch[i]).toUpperCase();

			} else if (ch[i] == ' ') {
				finals += ch[i];

			} else if (ch[i - 1] == ' ') {
				finals += String.valueOf(ch[i]).toUpperCase();
				// i++;

			} else {
				finals += ch[i];
			}
		}

		System.out.println(finals);
		sc.close();

	}
}

public class Without_String {
	public static void main(String[] args) {
		A_String ob = new A_String();
		ob.meth();
	}

}
