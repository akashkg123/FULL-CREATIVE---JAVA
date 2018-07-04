package Trail;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class A {
	int roll;
	String name;

	A(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

}

class B {
	int roll;
	String name;

	B(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

}

class mycomparator1 implements Comparator<Integer> {

	@Override
	public int compare(Integer ob1, Integer ob2) {

		if (ob1 < ob2) {
			return 1;

		} else if (ob1 == ob2) {
			return 0;
		} else {
			return -1;
		}
	}

}

public class Do {

	public static void main(String[] args) {

		A ob = new A(100, "Akash");
		A ob1 = new A(200, "Kg");
		B obj = new B(100, "Akash");
		B obj1 = new B(200, "Kg");

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(ob.roll);
		ll.add(ob1.roll);
		ll.add(obj.roll);
		ll.add(obj1.roll);

		System.out.println(ll);

		Collections.sort(ll, new mycomparator1());
		System.out.println(ll);

	}

}
