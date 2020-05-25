package com.sergiomartinrubio.javasortingalgorithms.comparisonbased;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HeapSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenSortValues() {
        // GIVEN
        int[] values = {5, 1, 12, -5, 16, 15};
        HeapSort heapSort = new HeapSort();

        // WHEN
        heapSort.sort(values);

        // THEN
        assertThat(values).containsExactly(-5, 1, 5, 12, 15, 16);
    }

}