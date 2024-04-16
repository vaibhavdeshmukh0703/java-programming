package Synchronisation;

public class Client {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);       
        Substractor substractor = new Substractor(counter);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(substractor);
        
        t1.start();
        t2.start();

        System.out.println(counter.count);

    }
}
