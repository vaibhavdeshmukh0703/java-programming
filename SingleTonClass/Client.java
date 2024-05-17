package SingleTonClass;
public class Client {
    public static void main(String args[])
    {
        CheckThread c = new CheckThread();
        for(int i=0; i<10; i++)
        {
            Thread t = new Thread(c);
            t.start();
        }
    }
}
