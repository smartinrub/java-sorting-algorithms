package com.sergiomartinrubio.javasortingalgorithms.comparisonbased;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InsertionSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenSortValues() {
        // GIVEN
        int[] values = {5, 1, 12, -5, 16};
        InsertionSort insertionSort = new InsertionSort();

        // WHEN
        insertionSort.sort(values);

        // THEN
        assertThat(values).containsExactly(-5, 1, 5, 12, 16);
    }

}