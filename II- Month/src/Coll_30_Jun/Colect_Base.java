package Coll_30_Jun;

import java.util.ArrayList;
import java.util.List;

class A_Collect {
	public void meth() {

		List<String> al = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("8");
		al.add("9");
		al.add("10");
		al.add("11");
		al.add("12");
		al.add("13");
		al.add("14");
		al.add("15");
		al.add("16");
		al.add("17");
		al.add("18");
		al.add("19");
		al.add("20");
		al.add("21");
		al.add("22");
		al.add("23");
		al.add("24");

		System.out.println("Size of the ArrayList: " + al.size());
		long initial = System.currentTimeMillis();

		for (int i = 6; i >= 2; i--) {
			// System.out.println("i am in");

			al.remove(i);

		}

		long finaltime = System.currentTimeMillis();

		System.out.println(finaltime - initial);

		System.out.println("Size of the ArrayList: " + al.size());

		// Iterator it = al.iterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// }

	}
}

public class Colect_Base {
	public static void main(String[] args) {
		A_Collect ob = new A_Collect();
		ob.meth();
	}

}
