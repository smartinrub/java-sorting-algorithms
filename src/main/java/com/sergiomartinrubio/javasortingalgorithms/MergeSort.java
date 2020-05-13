package com.sergiomartinrubio.javasortingalgorithms;

public class MergeSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {
        if (array.length > 1) {
            int[] left = new int[array.length / 2];
            int[] right = new int[array.length - left.length];
            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, left.length, right, 0, right.length);

            sort(left);
            sort(right);
            merge(array, left, right);
        }

    }

    private void merge(int[] result, int[] left, int[] right) {
        int indexLeft = 0;
        int indexRight = 0;
        int indexResult = 0;

        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                result[indexResult] = left[indexLeft];
                indexLeft++;
            } else {
                result[indexResult] = right[indexRight];
                indexRight++;
            }
            indexResult++;
        }

        System.arraycopy(left, indexLeft, result, indexResult, left.length - indexLeft);
        System.arraycopy(right, indexRight, result, indexResult, right.length - indexRight);
    }

}
