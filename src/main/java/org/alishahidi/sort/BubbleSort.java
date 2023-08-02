package org.alishahidi.sort;

import org.alishahidi.tools.Helpers;

public class BubbleSort {
    // Overloaded method with a single argument (ascending order)
    public static void sort(int[] array) {
        sort(array, false); // Call the version with reverse=false by default
    }

    public static void sort(int[] array, boolean reverse) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if ((reverse && array[j] < array[j + 1]) || (!reverse && array[j] > array[j + 1])) {
                    Helpers.swap(array, j, j + 1);

                }
            }
        }
    }
}
