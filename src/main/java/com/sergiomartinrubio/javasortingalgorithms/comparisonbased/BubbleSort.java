package com.sergiomartinrubio.javasortingalgorithms.comparisonbased;


public class BubbleSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

}
