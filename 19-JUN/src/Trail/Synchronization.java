package Trail;

class A_Syn {
	synchronized void meth(int x) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(x * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}

class B_Syn extends Thread {
	A_Syn ob;

	public B_Syn(A_Syn ob) {
		this.ob = ob;

	}

	public void run() {
		ob.meth(5);
	}

}

class C_Syn extends Thread {
	A_Syn ob;

	public C_Syn(A_Syn ob) {
		this.ob = ob;
	}

	public void run() {
		ob.meth(100);
	}
}

public class Synchronization {

	public static void main(String[] args) {
		final A_Syn ob1 = new A_Syn();
		B_Syn ob2 = new B_Syn(ob1);
		ob2.start();

		C_Syn ob3 = new C_Syn(ob1);
		ob3.start();

	}

}
