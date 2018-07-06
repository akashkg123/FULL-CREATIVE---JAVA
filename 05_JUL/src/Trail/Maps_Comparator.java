package Trail;

import java.util.Comparator;
import java.util.TreeMap;

class Maps {
	public void name() {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(102, "Nitheesh");
		tm.put(101, "akash");
		tm.put(105, "Nitheesh");
		tm.put(103, "Kg");
		tm.put(104, "Hello");
		System.out.println(tm.put(102, "akash"));
		System.out.println(tm);

		TreeMap<Integer, String> sort = new TreeMap<Integer, String>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2.compareTo(o1);
			}

		});

		sort.putAll(tm);
		System.out.println("Before Sorting: ");
		System.out.println(tm);
		System.out.println("After Sorting");
		System.out.println(sort);

	}

}

public class Maps_Comparator {

	public static void main(String[] args) {
		Maps ob = new Maps();
		ob.name();

	}

}
