package org.alishahidi.sort;

import org.alishahidi.tools.Helpers;

public class QuickSort {
    public static void sort(int[] array) {
        sort(array, false); // Call the version with reverse=false by default
    }

    public static void sort(int[] array, boolean reverse) {
        sort(array, 0, array.length - 1, reverse);
    }

    private static void sort(int[] array, int start, int end, boolean reverse) {
        if (end <= start) {
            return;
        }

        int pivot = partition(array, start, end, reverse);
        sort(array, start, pivot - 1, reverse);
        sort(array, pivot + 1, end, reverse);
    }

    private static int partition(int[] array, int start, int end, boolean reverse) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if ((reverse && array[j] >= pivot) || (!reverse && array[j] <= pivot)) {
                i++;
                Helpers.swap(array, i, j);
            }
        }
        i++;
        Helpers.swap(array, i, end);
        return i;
    }
}
