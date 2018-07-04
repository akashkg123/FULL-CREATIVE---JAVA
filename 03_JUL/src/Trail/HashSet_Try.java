package Trail;

import java.util.HashSet;

class HashSet_One {
	public void basic() {

		/*
		 * No duplicate values are added
		 */
		HashSet<String> hs = new HashSet<>();
		hs.add("AKASH");
		hs.add("Kg");
		hs.add("Chennai");
		hs.add("Full");
		hs.add("Kg");
		hs.add("Creative");
		hs.add("Kg");
		System.out.println(hs);

		System.out.println(hs.hashCode());
		String[] a = new String[hs.size()];

		hs.toArray(a);
		System.out.println("\nAfter converting to array:\n");
		for (String i : a) {
			System.out.println(i);

		}
		HashSet<String> hs1 = new HashSet<>();
		hs1.addAll(hs);

		System.out.println("\n I am copied HashSet:\n");
		System.out.println(hs1);

	}
}

public class HashSet_Try {

	public static void main(String[] args) {
		HashSet_One ob = new HashSet_One();
		ob.basic();
	}

}
