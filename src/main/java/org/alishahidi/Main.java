package org.alishahidi;

import org.alishahidi.sort.BubbleSort;
import org.alishahidi.sort.InsertionSort;
import org.alishahidi.sort.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 4,7, 8, 1,5};
//        BubbleSort.sort(array, true);
//        SelectionSort.sort(array, true);
        InsertionSort.sort(array, true);
        System.out.println(Arrays.toString(array));
    }
}