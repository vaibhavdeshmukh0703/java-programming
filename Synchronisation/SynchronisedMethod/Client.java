package Synchronisation.SynchronisedMethod;

public class Client {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        Calculate c2 = new Calculate();
        
        Thread t1 = new Thread(new Runnable(){ public void run(){
            try {
                c1.sub();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }});

        Thread t2 = new Thread(new Runnable(){ public void run(){
            c2.mul();
            // try {
               
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
        }});
        // Calculate.add();
        // c1.sub();
        // c1.mul();
        // c1.getTotal();
        t1.start();
        t2.start();

    }
}
