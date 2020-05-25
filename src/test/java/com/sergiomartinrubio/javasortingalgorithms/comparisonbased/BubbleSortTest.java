package com.sergiomartinrubio.javasortingalgorithms.comparisonbased;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenArrayIsSorted() {
        // GIVEN
        int[] values = {5, 1, 12, -5, 16};
        BubbleSort bubbleSort = new BubbleSort();

        // WHEN
        bubbleSort.sort(values);

        // THEN
        assertThat(values).containsExactly(-5, 1, 5, 12, 16);
    }
}