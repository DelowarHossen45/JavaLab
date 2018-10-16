package main;

import java.util.Date;
//import java.sql.Date;

public class GettingRunnable implements Runnable {
	public static final int REPITATION = 12;
	public static final int DELAY = 1000;
	private String geeting;

	public GettingRunnable(String aGeeting) {
		geeting = aGeeting;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < REPITATION; i++) {
				Date now = new Date();
//					synchronized(now1)
//					{
//						now1.sleep();
//					}
				System.out.println(now + " " + geeting);
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException exception) {

		}
	}
}
