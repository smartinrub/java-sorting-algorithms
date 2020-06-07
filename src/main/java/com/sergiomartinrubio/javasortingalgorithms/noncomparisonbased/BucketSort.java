package com.sergiomartinrubio.javasortingalgorithms.noncomparisonbased;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {

    private static final int BUCKET_SIZE = 2;

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(Integer[] array) {

        // calculate min and maximum values
        int minValue = array[0];
        int maxValue = array[0];
        for (Integer value : array) {
            if (value < minValue) {
                minValue = value;
            }
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // initialize buckets
        int bucketCount = (maxValue - minValue) / BUCKET_SIZE + 1;
        List<Integer>[] buckets = new List[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        // distribute values in buckets
        for (Integer value : array) {
            buckets[(value - minValue) / BUCKET_SIZE].add(value);
        }

        // sort buckets and concatenate
        int currentIndex = 0;
        for (List<Integer> listBucket : buckets) {
            Integer[] arrayBucket = new Integer[listBucket.size()];
            arrayBucket = listBucket.toArray(arrayBucket);
            insertionSort(arrayBucket);
            for (Integer value : arrayBucket) {
                array[currentIndex++] = value;
            }
        }

    }

    public void insertionSort(Integer[] array) {
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
