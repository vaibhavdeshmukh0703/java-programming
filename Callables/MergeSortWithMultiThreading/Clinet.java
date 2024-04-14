package Callables.MergeSortWithMultiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Clinet {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,2,5,3,8,5,7,6);
        ExecutorService eService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(list,eService);
        try {
            System.out.println("line 1");
            Future sortedArr = eService.submit(sorter);
            System.out.println("line 2");
            System.out.println("line 3");
            System.out.println(sortedArr.get());
          
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        eService.shutdown();
    }
}
