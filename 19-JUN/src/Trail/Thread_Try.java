package Trail;

class A_Thread extends Thread {
	public void run() {
		System.out.println("Hello I am run() in class A_Thread which EXTENDS THREAD ");
	}

}

class B_Thread implements Runnable {
	public void run() {
		System.out.println("Hello I am run() in class B_Thread which IMPLEMENTS RUNNABLE");
	}

}

class C_Sleep extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				// Thread.sleep(500);
				System.out.println(i);

			} catch (Exception e) {
				System.out.println("Check it");
			}

		}

	}
}

class D_Thread_Other extends Thread {

}

public class Thread_Try {

	public static void main(String[] args) {

		A_Thread ob = new A_Thread();
		ob.start();

		B_Thread ob2 = new B_Thread();
		Thread t1 = new Thread(ob2);
		t1.start();

		C_Sleep ob3 = new C_Sleep();
		ob3.start();

		try {
			ob3.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		C_Sleep ob4 = new C_Sleep();
		ob4.start();
		try {
			ob4.join(1000);

		} catch (Exception e) {
			System.out.println(e);
		}

		C_Sleep ob5 = new C_Sleep();
		ob5.start();
		System.out.println(ob5.getName());
		ob5.setName("I am ob5");
		System.out.println(ob5.getName());


	}

}
