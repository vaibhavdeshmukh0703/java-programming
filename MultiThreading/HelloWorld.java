package MultiThreading;

public class HelloWorld implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Hello World method run on thread : "+Thread.currentThread().getName());    
    }
    
}

