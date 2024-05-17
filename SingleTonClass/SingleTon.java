package SingleTonClass;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingleTon {
    private static SingleTon singleTon = null;
    private static Lock lock =  new ReentrantLock();
    private SingleTon()
    {
        
    }
    public static SingleTon getSingleTon() {
        if(singleTon == null)
        {
            lock.lock();
            if(singleTon == null)
            {
                singleTon = new SingleTon();
            }
            lock.unlock();
        } 

        return singleTon;
    }
}
