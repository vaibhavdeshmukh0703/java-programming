package Callables.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class Clinet {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,2,6,9,8,5);
        Sorter sorter = new Sorter(list);
        List<Integer> sortedArray = sorter.sort();
        System.out.println(sortedArray);
    }
}
