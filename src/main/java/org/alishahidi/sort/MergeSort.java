package org.alishahidi.sort;

public class MergeSort {
    public static void sort(int[] array) {
        sort(array, false); // Call the version with reverse=false by default
    }

    public static void sort(int[] array, boolean reverse) {
        int length = array.length;
        if (length <= 1) {
            return;
        }

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for (int i = 0; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - middle] = array[i];
            }
        }

        sort(leftArray, reverse);
        sort(rightArray, reverse);
        merge(leftArray, rightArray, array, reverse);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array, boolean reverse) {
        int length = array.length;
        int leftLength = length / 2;
        int rightLength = length - leftLength;
        int i = 0, l = 0, r = 0;

        while (l < leftLength && r < rightLength) {
            if ((reverse && leftArray[l] >= rightArray[r]) || (!reverse && leftArray[l] <= rightArray[r])) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftLength) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightLength) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
