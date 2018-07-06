package Trail;

import java.util.ArrayList;

import java.util.Collections;

class CompareTo_One {
	public void basic() {
		ArrayList<String> al = new ArrayList<>();

		al.add("Akash");
		al.add("Aka");
		al.add("Chennai");
		al.add("Full");
		al.add("Kg");
		al.add("Creative");
		al.add("Kg");
		al.add("122g");
		al.add("111g");
		al.add("111h");
		System.out.println(al);

		Collections.sort(al);

	}
}

class mycompareable implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class CompareTo_Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
