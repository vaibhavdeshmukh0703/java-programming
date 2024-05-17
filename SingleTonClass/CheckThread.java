package SingleTonClass;

public class CheckThread implements Runnable{
    public void run(){
        SingleTon singleton = SingleTon.getSingleTon();
        System.out.println(singleton+" --->" + Thread.currentThread().getName());
    }
}
