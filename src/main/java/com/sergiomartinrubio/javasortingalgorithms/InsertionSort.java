package com.sergiomartinrubio.javasortingalgorithms;

public class InsertionSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i;

            while (j >= 1 && array[j - 1] > currentValue) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = currentValue;
        }

    }
}
