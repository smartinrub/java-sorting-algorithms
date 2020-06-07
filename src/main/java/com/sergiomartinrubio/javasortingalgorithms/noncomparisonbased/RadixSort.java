package com.sergiomartinrubio.javasortingalgorithms.noncomparisonbased;

public class RadixSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {
        int maxValue = findMax(array);

        for (int multiplier = 1; maxValue / multiplier > 0; multiplier *= 10) {
            countingSort(array, multiplier, maxValue);
        }
    }

    private int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private void countingSort(int[] array, int position, int maxValue) {
        int[] aux = new int[maxValue + 1];
        int[] output = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            aux[(array[i] / position) % 10]++;
        }

        for (int i = 1; i < maxValue; i++) {
            aux[i] = aux[i] + aux[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[aux[(array[i] / position) % 10] - 1] = array[i];
            aux[(array[i] / position) % 10]--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }

}
