package Semaphore.Semaphore;

import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    Semaphore semaphore1;
    Semaphore semaphore2;
    public FooBar(int n) {
        this.n = n;
        this.semaphore1 = new Semaphore(1);
        this.semaphore2 = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {  
        for (int i = 0; i < n; i++) {
            semaphore1.acquire();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            semaphore2.release();
            }
        }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
           semaphore2.acquire();
        	printBar.run();
            semaphore1.release();
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        }
    }
}
