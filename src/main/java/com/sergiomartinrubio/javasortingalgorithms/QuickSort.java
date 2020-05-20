package com.sergiomartinrubio.javasortingalgorithms;

public class QuickSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int lowerBound, int upperBound) {
        int pivot;

        if (upperBound > lowerBound) {
            pivot = partition(array, lowerBound, upperBound);
            quickSort(array, lowerBound, pivot - 1);
            quickSort(array, pivot + 1, upperBound);
        }
    }

    private int partition(int[] array, int lowerBound, int upperBound) {
        int pivotElement = array[lowerBound];
        int leftIndex = lowerBound;
        int rightIndex = upperBound;

        while (leftIndex < rightIndex) {
            while (array[leftIndex] <= pivotElement) {
                leftIndex++;
            }

            while (array[rightIndex] > pivotElement) {
                rightIndex--;
            }

            if (leftIndex < rightIndex) {
                int aux = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = aux;
            }
        }

        array[lowerBound] = array[rightIndex];
        array[rightIndex] = pivotElement;
        return rightIndex;
    }
}
