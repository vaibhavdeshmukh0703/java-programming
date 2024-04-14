package Print1to100onSeperateThreadUsingExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Client{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for( int i=1;i<=100;i++){
            if(i==5 || i==12 || i==15){
                System.out.println("DEBUG");
            }
            Runnable printOneToHundread = new PrintOneToHundread(i);
            executor.execute(printOneToHundread);
            
        }
        executor.shutdown();
        
    }
}
