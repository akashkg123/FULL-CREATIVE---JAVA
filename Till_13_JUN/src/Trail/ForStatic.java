package Trail;

class Enroll {

	static int attendance = 10;
	String college = "ANNA UNIVERSITY";

	Enroll() {
		System.out.println(++attendance + " " + college);
	}

	public static void details() {
		System.out.println("HERE STUDENT DETAILS WILL BE CREATED!!");

	}

	static {
		System.out.println("I am Static Block!!");
	}

	public void general() {
		System.out.println("I am normal method!!");
	}
}

public class ForStatic {
	public static void main(String[] args) {
		new Enroll();//
		new Enroll();
		new Enroll();
		Enroll ob = new Enroll();
		ob.general();
		Enroll.details();

	}

}
