package Trail;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class LL_One {
	public void basic() {
		System.out.println("\t\t\t__________\n");
		System.out.println("\t\t\tI am Basic");
		System.out.println("\t\t\t___________\n");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Akash");
		ll.add("Kg");
		ll.add("Chennai");
		ll.add("Full");
		ll.add("Kg");
		ll.add("Creative");
		ll.add("Kg");
		System.out.println(ll);

		System.out.println("First element: " + ll.getFirst());
		System.out.println("last element: " + ll.getLast());

		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println();

	}
}

class LL_Two {
	@SuppressWarnings("unchecked")
	public void cloned() {

		System.out.println("\t\t\t__________\n");
		System.out.println("\t\t\tI am Clone");
		System.out.println("\t\t\t___________\n");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Akash");
		ll.add("Kg");
		ll.add("Chennai");
		ll.add("Full");
		ll.add("Kg");
		ll.add("Creative");
		ll.add("Kg");
		System.out.println(ll);

		LinkedList<String> ll1 = (LinkedList<String>) ll.clone();
		ll1.add("hi");
		System.out.println("I am Cloned: " + ll1);

	}
}

class LL_Three {
	public void comp() {

		System.out.println("\t\t\t______________\n");
		System.out.println("\t\t\tI am Compartor");
		System.out.println("\t\t\t______________\n");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Akash");
		ll.add("Kg");
		ll.add("Chennai");
		ll.add("Full");
		ll.add("Kg");
		ll.add("Creative");
		ll.add("Kg");
		System.out.println(ll);

	}

	public void details() {
		LinkedList<Integer> lli = new LinkedList<>();
		lli.add((23));
		lli.add((1));
		lli.add((9));
		lli.add((23));
		lli.add((1));
		lli.add((9));

		lli.offerFirst(123);

		Collections.sort(lli, new mycomparator());

		System.out.println(lli);

	}

}

class mycomparator implements Comparator<Integer> {

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

public class LinkedList_Try {
	public static void main(String[] args) {
		// LL_One ob = new LL_One();
		// ob.basic();
		//
		// LL_Two ob1 = new LL_Two();
		// ob1.cloned();

		LL_Three ob2 = new LL_Three();
		ob2.details();

	}

}
