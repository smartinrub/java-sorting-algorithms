package com.sergiomartinrubio.javasortingalgorithms.noncomparisonbased;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class RadixSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenArrayIsSorted() {
        // GIVEN
        int[] values = {75, 48, 137, 61, 206, 43, 8, 239, 124};
        RadixSort radixSort = new RadixSort();

        // WHEN
        radixSort.sort(values);

        // THEN
        assertThat(values).containsExactly(8, 43, 48, 61, 75, 124, 137, 206, 239);
    }

}
