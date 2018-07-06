package Trail;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

class Map_One {

	public void basic() {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Akash");
		hm.put(5, "Kg");
		hm.put(3, "Chennai");
		hm.put(4, "FULL");
		System.out.println(hm);

		HashMap<Integer, String> hm1 = new HashMap<>(hm);
		System.out.println(hm1);

	}
}

class Map_Two {
	public void name() {
		HashMap<Integer, String> hm = new HashMap<>();
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		TreeMap<Integer, String> tm = new TreeMap<>();
		System.out.println("____________");
		System.out.println("I am HashMap");
		System.out.println("____________");
		test(hm);
		System.out.println("__________________");
		System.out.println("I am LinkedHashMap");
		System.out.println("__________________");
		test(lhm);
		System.out.println("____________");
		System.out.println("I am TreeMap");
		System.out.println("____________");
		test(tm);

	}

	private void test(Map<Integer, String> h) {
		h.put(1, "Akash");
		h.put(5, "Kg");
		h.put(3, "Chennai");
		h.put(4, "FULL");
		h.put(8, "Akash");
		h.put(9, "Kg");
		h.put(10, "Chennai");
		h.put(14, "FULL");

		for (Integer i : h.keySet()) {
			System.out.println("Key: " + i + " Value: " + h.get(i));

		}
		System.out.println("\n");

	}
}

class Set {
	public void name() {
		HashSet<String> hs = new HashSet<>();
		hs.add("Akash");
		hs.add("Kg");
		hs.add("Chennai");
		hs.add("FULL");
		hs.add("Akash1");
		hs.add("Kg1");
		hs.add("Chennai1");
		hs.add("FULL1");
		System.out.println(hs);

	}

}

class Queue_One {
	public void name() {
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("Akash");
		q.add("Kg");
		q.add("Chennai");
		q.add("FULL");
		q.add("Akash1");
		q.add("Kg1");
		q.add("Chennai1");
		q.add("FULL1");
		// System.out.println(q.add("add"));
		// System.out.println(q);
		//
		System.out.println(q.offer("Offer"));
		System.out.println(q);

	}
}

public class Maps_try {

	public static void main(String[] args) {
		// Map_One ob = new Map_One();
		// ob.basic();

		// Map_Two ob1 = new Map_Two();
		// ob1.name();

		// Set ob2 = new Set();
		// ob2.name();

		Queue_One ob3 = new Queue_One();
		ob3.name();

	}

}
