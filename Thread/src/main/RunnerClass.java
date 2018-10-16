package main;

public class RunnerClass {
	public static void main(String arg[])
	{
		OutPut r1=new OutPut("Apple Mahmud");
		OutPut r2=new OutPut("Good bye");
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);

		t1.start();
		t2.start();
	}
}
