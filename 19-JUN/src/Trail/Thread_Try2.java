package Trail;

class A_Priyority extends Thread {
	public void run() {
		System.out.println("I am run() in class A_Try");
		System.out.println(Thread.currentThread().getPriority());
	}
}
class B_Daemon extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Yes I am a Daemon thread");
		}
		else {
			System.out.println("I am a NORMAL thread.");
		}
	}
}

public class Thread_Try2 {
	public Thread_Try2() {
		System.out.println("I am base class constructor");

	}

	public static void main(String[] args) {
		A_Priyority ob = new A_Priyority();
		ob.setPriority(Thread.MIN_PRIORITY);
		ob.start();
		
		B_Daemon ob2 = new B_Daemon();
		ob2.setDaemon(true);
		ob2.start();
		

	}

}
