package Trail;

import java.util.ArrayList;
import java.util.Iterator;

class One {
	int roll;
	String name;

	One(int roll, String name) {
		this.roll = roll;
		this.name = name;

		//System.out.println("Roll no: " + roll + " Name: " + name);

	}

	public String toString() {
		return "Roll no: " + roll + " Name: " + name;

	}
}

public class WithObj {
	public static void main(String[] args) {
		ArrayList<One> al = new ArrayList<>();
		al.add(new One(101, "Akash"));
		al.add(new One(102, "Nitheesh"));
		al.add(new One(103, "Rajaneesh"));

		Iterator<One> it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
