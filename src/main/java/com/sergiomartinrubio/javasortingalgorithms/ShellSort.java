package com.sergiomartinrubio.javasortingalgorithms;

public class ShellSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {
        // We start in the middle and the gap is divided by 2 in each iteration
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            // A portion of the array is sorted
            for (int i = gap; i < array.length; i++) {
                int aux = array[i];
                int j = i;

                // Compare both ends of the array subset
                // In the first iteration array[0] > array[array.length/2]
                while (j >= gap && array[j - gap] > aux) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = aux;
            }
        }
    }
}
