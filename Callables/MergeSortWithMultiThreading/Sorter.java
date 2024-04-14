package Callables.MergeSortWithMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executerService ;
    public Sorter(List<Integer> list,ExecutorService eService ){
        arrayToSort = list;
        executerService = eService;
    }
    @Override
    public List<Integer> call() throws InterruptedException, ExecutionException {

        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
        int mid = arrayToSort.size()/2;
        List<Integer> leftArr = new ArrayList<Integer>();
        List<Integer> rightArr = new ArrayList<Integer>();

        for(int i=0;i<mid;i++){
            leftArr.add(arrayToSort.get(i));
        }
        for(int i=mid;i<arrayToSort.size();i++){
            rightArr.add(arrayToSort.get(i));
        }

        Sorter leftSorter = new Sorter(leftArr,executerService);
        Sorter rightSorter = new Sorter(rightArr,executerService);

        Future<List<Integer>> leftSortedArrFuture = executerService.submit(leftSorter);
        Future<List<Integer>> rightSorterArrFuture = executerService.submit(rightSorter);

        int i=0, j=0;
        List<Integer> sortedArr = new ArrayList<Integer>();
        
        List<Integer> leftSortedArr = leftSortedArrFuture.get();
        List<Integer> rightSorterArr = rightSorterArrFuture.get();
        
        while (i<leftSortedArr.size() && j<rightSorterArr.size()) {
            if(leftSortedArr.get(i) < rightSorterArr.get(j)){
                sortedArr.add(leftSortedArr.get(i));
                i++;
            }else{
                sortedArr.add(rightSorterArr.get(j));
                j++;
            }
        }
        while (i<leftSortedArr.size() ) {
            sortedArr.add(leftSortedArr.get(i));
            i++;
        }
        while (j<rightSorterArr.size() ) {
            sortedArr.add(rightSorterArr.get(j));
            j++;
        }

        return sortedArr;
    }   
}
