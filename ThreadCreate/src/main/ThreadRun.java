package main;

public class ThreadRun {
	public static void main(String agr[]) {
		GettingRunnable r1 = new GettingRunnable("Apple Mahmud");
		GettingRunnable r2 = new GettingRunnable("Good Evening");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		// r1.run();
		t1.start();
		t2.start();

	}

}
