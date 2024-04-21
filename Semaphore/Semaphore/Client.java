package Semaphore.Semaphore;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        int n = 4;
        FooBar fooBar = new FooBar(n);
        PrintBar printBar = new PrintBar();
        PrintFoo printFoo = new PrintFoo();

        Thread t1 = new Thread(() -> {
            try {
                fooBar.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                fooBar.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
       

     

    }
}