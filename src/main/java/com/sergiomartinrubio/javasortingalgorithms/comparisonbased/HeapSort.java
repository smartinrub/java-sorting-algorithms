package com.sergiomartinrubio.javasortingalgorithms.comparisonbased;

public class HeapSort {

    /**
     * Sort an array
     *
     * @param array to be sorted
     */
    public void sort(int[] array) {
        buildMaxHeapTree(array);
        // once the heap tree is built the array is ordered
        for (int lastNodeIndex = array.length - 1; lastNodeIndex > 0; lastNodeIndex--) {
            int aux = array[0];
            // the greatest value in on the first node of the tree,
            // so it's now put at the end of the array
            array[0] = array[lastNodeIndex];
            array[lastNodeIndex] = aux;
            // put greatest value at the root again
            heapify(array, lastNodeIndex, 0);
        }
    }

    // O(n)
    void buildMaxHeapTree(int[] array) {
        int treeLengthExcludingLastRow = array.length / 2 - 1;
        // go through all the nodes except for the last row of the tree
        for (int nodeIndex = treeLengthExcludingLastRow; nodeIndex >= 0; nodeIndex--) {
            heapify(array, array.length, nodeIndex);
        }

    }

    // O(log n)
    void heapify(int[] array, int arrayLength, int nodeIndex) {
        int largest = nodeIndex;
        // in a tree the left node of any node is at: the double of the current position plus one
        int left = nodeIndex * 2 + 1;
        // in a tree the left node of any node is at: the double of the current position plus two
        int right = nodeIndex * 2 + 2;

        // the left child is greater than the current node?
        if (left < arrayLength && array[left] > array[largest]) {
            largest = left;
        }

        // the right child is greater than the current node?
        if (right < arrayLength && array[right] > array[largest]) {
            largest = right;
        }

        // if any of the children nodes are greater than the current node
        // the nodes are swapped
        if (largest != nodeIndex) {
            int aux = array[nodeIndex];
            array[nodeIndex] = array[largest];
            array[largest] = aux;
            // keep moving to the child
            heapify(array, arrayLength, largest);
        }

    }
}
