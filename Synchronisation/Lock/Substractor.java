package Synchronisation.Lock;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable {
    private Counter counter;
    private Lock lock;
    public Substractor(Counter counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    public void run(){
        for(int i=0;i<10000;i++)
        {
            lock.lock();
            counter.count -=1;
            lock.unlock();
        }
    }
}
