package Synchronisation.Synchronised;
import java.util.concurrent.*;
public class Substractor implements Runnable {
    private Counter counter;
    public Substractor(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i=0;i<10000;i++)
        {   
            synchronized(counter){
                counter.count -=1;
            }
        }
    }
}
