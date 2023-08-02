package org.alishahidi.sort;

public class InsertionSort {
    public static void sort(int[] array) {
        sort(array, false); // Call the version with reverse=false by default
    }

    public static void sort(int[] array, boolean reverse) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0 && ((reverse && array[j] < tmp) || (!reverse && array[j] > tmp))) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }
}
