package com.sergiomartinrubio.javasortingalgorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenArrayIsSorted() {
        // GIVEN
        int[] values = {5, 1, 12, -5, 16};
        SelectionSort selectionSort = new SelectionSort();

        // WHEN
        selectionSort.sort(values);

        // THEN
        assertThat(values).containsExactly(-5, 1, 5, 12, 16);
    }

}