package Print1to100onSeperateThread;

public class Client{
    public static void main(String[] args) {
    
        for( int i=1;i<=100;i++){
            Runnable printOneToHundread = new PrintOneToHundread(i);
            Thread t = new Thread(printOneToHundread);
            t.start();
            
        }
    }
}
