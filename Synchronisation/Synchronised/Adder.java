package Synchronisation.Synchronised;

public class Adder implements Runnable {
   private Counter counter;
    public Adder(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i=0;i<10000;i++)
        {
            synchronized(counter){
                counter.count +=1;
            }
        }
    }
}
