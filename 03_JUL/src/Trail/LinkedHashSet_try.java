package Trail;

import java.util.LinkedHashSet;

class LinkedHashSet_One {
	public void basic() {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Akash");
		lhs.add("Kg");
		lhs.add("Chennai");
		lhs.add("Full");
		lhs.add("Kg");
		lhs.add("Creative");
		lhs.add("Kg");
		System.out.println(lhs);

	}
}

public class LinkedHashSet_try {

	public static void main(String[] args) {
		LinkedHashSet_One ob = new LinkedHashSet_One();
		ob.basic();

	}

}
