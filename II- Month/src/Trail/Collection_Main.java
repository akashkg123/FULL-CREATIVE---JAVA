package Trail;

import java.util.ArrayList;
import java.util.Iterator;

class A_Collect {
	public void meth() {

		ArrayList<String> al = new ArrayList<>();
		al.add("Akash");
		al.add("kg");
		al.add("Kg");
		al.add("Nitheesh");

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}

class B_Iter {
	int roll;
	String name;

	public B_Iter(int roll, String name) {
		this.roll = roll;
		this.name = name;

		// System.out.println(roll + " " + name);

	}

}

public class Collection_Main {
	public static void main(String[] args) {
		A_Collect ob = new A_Collect();
		ob.meth();
		//
		// B_Iter ob1 = new B_Iter(2001, "Akash");
		// B_Iter ob2 = new B_Iter(2001, "Akash");
		// B_Iter ob3 = new B_Iter(2001, "Akash");
		//
		// ArrayList<B_Iter> al = new ArrayList<>();
		// al.add(ob1);
		// al.add(ob2);
		// al.add(ob3);
		// Iterator<B_Iter> it = al.iterator();
		//
		// while (it.hasNext()) {
		// B_Iter it1 = (B_Iter) it.next();
		// System.out.println(it1.roll + " " + it1.name);
		// }

	}

}
