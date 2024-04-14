package Callables;

import java.util.concurrent.Callable;

public class PrintNumber implements Callable {
    private int num;
    public PrintNumber(int num)
    {
        this.num = num;
    }
    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        return num;
    }

}
