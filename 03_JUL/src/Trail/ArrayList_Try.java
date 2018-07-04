package Trail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class AL_One {
	public void iterator_1() {
		System.out.println("\t\t\t__________________________\n");
		System.out.println("\t\t\tI am Type 1 using Iterator");
		System.out.println("\t\t\t__________________________\n");

		ArrayList<String> al = new ArrayList<>();

		al.add("Akash");
		al.add("Kg");
		al.add("Chennai");
		al.add("Full");
		al.add("Kg");
		al.add("Creative");
		al.add("Kg");
		System.out.println(al);

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {
			if (it.next().equals("Kg")) {
				it.remove();
			}

		}

		al.add(0, "Kg");
		System.out.println(al + "\n");

	}
}

class AL_Two {
	public void copyonwrite() {
		System.out.println("\t\t\t_______________________________\n");
		System.out.println("\t\t\tI am Type 2 using Copy on write");
		System.out.println("\t\t\t_______________________________\n");
		CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();

		cal.add("Akash");
		cal.add("Kg");
		cal.add("Chennai");
		cal.add("Full");
		cal.add("Kg");
		cal.add("Creative");
		cal.add("Kg");
		System.out.println(cal);

		Iterator<String> it = cal.iterator();
		int counter = -1;
		int find = 0;
		while (it.hasNext()) {
			++counter;
			if (it.next().equals("Kg")) {
				find = counter;
				cal.remove(find);
				--counter;
			}

		}

		cal.add(0, "Kg");
		System.out.println(cal + "\n");

	}
}

class AL_Three {
	public void removeAllmeth() {
		System.out.println("\t\t\t_____________________________\n");
		System.out.println("\t\t\tI am Type 3 using removeAll()");
		System.out.println("\t\t\t_____________________________\n");

		ArrayList<String> al = new ArrayList<>();

		al.add("Akash");
		al.add("Kg");
		al.add("Chennai");
		al.add("Full");
		al.add("Kg");
		al.add("Creative");
		al.add("Kg");
		System.out.println(al);

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Kg");

		al.removeAll(al1);

		al.add(0, "Kg");
		System.out.println(al + "\n");

	}
}

public class ArrayList_Try {
	public static void main(String[] args) {
		AL_One ob = new AL_One();
		ob.iterator_1();

		AL_Two ob1 = new AL_Two();
		ob1.copyonwrite();

		AL_Three ob2 = new AL_Three();
		ob2.removeAllmeth();
	}

}
