package com.sergiomartinrubio.javasortingalgorithms.comparisonbased;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShellSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenArrayIsSorted() {
        // GIVEN
        int[] values = {5, 1, 12, -5, 16};
        ShellSort shellSort = new ShellSort();

        // WHEN
        shellSort.sort(values);

        // THEN
        assertThat(values).containsExactly(-5, 1, 5, 12, 16);
    }

}