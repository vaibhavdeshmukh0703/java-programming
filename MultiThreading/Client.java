package MultiThreading;

public class Client {
    public static void main(String[] args) {
        Runnable runnable = new HelloWorld();
        Thread t = new Thread(runnable);
        t.start();

        HelloWorld helloWorld = new HelloWorld();
        Thread t1 = new Thread(helloWorld);
        t1.start();
    }
}
