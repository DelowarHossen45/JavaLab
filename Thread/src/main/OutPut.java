package main;

//import java.sql.Date;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public  class OutPut implements Runnable{
	String name;
	private Lock lock=new ReentrantLock();
	int DELAY	=1000;
	int RIPITATION =6;
	
	
	public OutPut(String hello)
	{
		name=hello;
	}
	@Override
	public void run() {
		try
		{
			for(int i=0;i<RIPITATION;i++)
			{
				Date now = new Date();
				lock.lock();
				System.out.println(now + " " + name);
				Thread.sleep(DELAY);
				lock.unlock();
			}
		}catch (InterruptedException exception)
		{
			
		}
		
	}
}
