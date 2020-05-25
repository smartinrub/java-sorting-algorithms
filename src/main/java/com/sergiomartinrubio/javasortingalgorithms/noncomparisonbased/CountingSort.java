package com.sergiomartinrubio.javasortingalgorithms.noncomparisonbased;

public class CountingSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {

        // find larges value in array
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] count = new int[max + 1];
        // initialize output array with zero values given max value
        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }

        // store count of each element
        for (int value : array) {
            count[value]++;
        }

        // store cumulative count of each element
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] sorted = new int[array.length + 1];
        // find the index of each element of the original array
        // in the count array and place the elements in the sorted array
        for (int i = array.length - 1; i >= 0; i--) {
            sorted[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // copy sorted array to original array
        for (int i = 0; i < array.length; i++) {
            array[i] = sorted[i];
        }
    }
}
