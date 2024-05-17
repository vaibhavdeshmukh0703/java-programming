package Synchronisation.SynchronisedMethod;

public class Calculate {
    private static int total;
    public Calculate()
    {
        total = 0;
    }
    public static synchronized void add() throws InterruptedException{
       
        System.out.println("Executed add method");     
    }

    public synchronized void sub() throws InterruptedException{
        System.out.println("Executed Add t1");
        Thread.sleep(5000);
        System.out.println("Executed sub method");     
    }

    public synchronized void mul(){
        System.out.println("Executed Add t2");
        System.out.println("Executed mult method");     
    }

    public void getTotal(){
        System.out.println("Executed Add t2");

        System.out.println("Executed get total method");     
    }
}
