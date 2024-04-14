package Callables.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    private List<Integer> arrayToSort;

    public Sorter(List<Integer> list){
        arrayToSort = list;
    }

    public List<Integer> sort(){

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

        Sorter leftSorter = new Sorter(leftArr);
        Sorter rightSorter = new Sorter(rightArr);

        List<Integer> leftSortedArr = leftSorter.sort();
        List<Integer> rightSorterArr = rightSorter.sort();

        int i=0, j=0;
        List<Integer> sortedArr = new ArrayList<Integer>();
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
