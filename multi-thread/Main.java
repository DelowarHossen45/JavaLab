public class Main {
    public static void main(String[] args) {
        Runnable r1 = new MyGreetings(", Hello");
        Runnable r2 = new MyGreetings(", Good Morning");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.interrupt();
        t1.start();
        t2.start();
    }
}