package Trail;

class A_Testing {
	public void meth1() {

		String a = "Akash is a good boy";

		String[] c = a.split(" ");

		int i;

		for (i = 0; i < c.length; i++) {

			char[] ch = c[i].toCharArray();
			for (int j = ch.length - 1; j >= 0; j--) {
				System.out.print(ch[j]);

			}
			System.out.print(" ");

		}
	}

	public void meth2() {
		System.out.println();
		String a = "Srini is a good boy";
		String ab[] = a.split(" ");

		for (int i = 0; i < ab.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(ab[i]);
			System.out.print(sb.reverse() + " ");

		}

	}

	public void meth3() {
		System.out.println();
		String a = "Joel is a good boy ";

		char[] ch = a.toCharArray();
		String last = "";
		String newz = "";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {

				last = last + " ";
				newz = newz + last;
				last = "";

			} else {

				last = String.valueOf(ch[i]) + last;

			}

		}
		System.out.print(newz + " ");

	}

	class B_Testing {

	}

}

class c_Testing {

	String[] ab = { "Ram is a hokey player", " Ram is a short tempered", "Ram age is 25", "He has a brother." };

}

public class Testing {
	

	public static void main(String[] args) {
		
		

		
		A_Testing ob = new A_Testing();
		ob.meth1();
		ob.meth2();
		ob.meth3();

		// B_Testing ob1 = new B_Testing();
		// ob1.meth2();
	}

}
