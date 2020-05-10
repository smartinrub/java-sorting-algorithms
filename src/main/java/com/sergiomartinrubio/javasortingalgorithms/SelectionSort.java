package com.sergiomartinrubio.javasortingalgorithms;

public class SelectionSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int aux = array[i];
            array[i] = array[min];
            array[min] = aux;
        }
    }
}
