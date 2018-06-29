package Trail;

class A extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("I class " + i);
			// try {
			// Thread.sleep(2000);
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

		}
	}
}

class B extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("II class " + i);
			// try {
			// Thread.sleep(2000);
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

		}
	}
}

public class Threading {

	public static void main(String[] args) {

		A ob = new A();
		B ob1 = new B();

		ob.start();

		// try {
		// ob.join();
		//
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		ob1.start();
		ob.setPriority(Thread.MAX_PRIORITY);
	}

}
