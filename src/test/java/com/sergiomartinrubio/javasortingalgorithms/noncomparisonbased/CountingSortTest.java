package com.sergiomartinrubio.javasortingalgorithms.noncomparisonbased;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountingSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenArrayIsSorted() {
        // GIVEN
        int[] values = {9, 4, 1, 7, 9, 1, 2, 0};
        CountingSort bubbleSort = new CountingSort();

        // WHEN
        bubbleSort.sort(values);

        // THEN
        assertThat(values).containsExactly(0, 1, 1, 2, 4, 7, 9, 9);
    }

}