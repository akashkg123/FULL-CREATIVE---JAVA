package Trail;

public class Revision {
	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("hi");
				// try {
				// Thread.sleep(1000);
				// } catch (InterruptedException e) {
				//
				// e.printStackTrace();
				// }

			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("hello");
				// try {
				// Thread.sleep(2000);
				// } catch (InterruptedException e) {
				//
				// e.printStackTrace();
				// }

			}

		});
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.join();

		t1.start();
		t2.start();

		new Thread() {
			public void run() {
				System.out.println("I am Thread Anonymous Class");
			}

		}.start();

	}

}
