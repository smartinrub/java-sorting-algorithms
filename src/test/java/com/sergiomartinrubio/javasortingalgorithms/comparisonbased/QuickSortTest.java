package com.sergiomartinrubio.javasortingalgorithms.comparisonbased;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenSortValues() {
        // GIVEN
        int[] values = {5, 1, 12, -5, 16};
        QuickSort mergeSort = new QuickSort();

        // WHEN
        mergeSort.sort(values);

        // THEN
        assertThat(values).containsExactly(-5, 1, 5, 12, 16);
    }

}