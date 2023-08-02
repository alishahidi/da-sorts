package org.alishahidi.sort;

import org.alishahidi.tools.Helpers;

public class SelectionSort {
    // Overloaded method with a single argument (ascending order)
    public static void sort(int[] array) {
        sort(array, false); // Call the version with reverse=false by default
    }

    public static void sort(int[] array, boolean reverse) {
        for (int i = 0; i < array.length - 1; i++) {
            // min must be named as max as reverse order;
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if ((reverse && array[min] < array[j]) || (!reverse && array[min] > array[j])) {
                    min = j;
                }
            }
            Helpers.swap(array, i, min);
        }
    }
}
