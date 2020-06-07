package com.sergiomartinrubio.javasortingalgorithms.noncomparisonbased;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class BucketSortTest {

    @Test
    public void givenArrayWithUnorderedValuesWhenSortThenArrayIsSorted() {
        // GIVEN
        Integer[] values = {9, 4, 1, 7, 9, 1, 2, 0};
        BucketSort bucketSort = new BucketSort();

        // WHEN
        bucketSort.sort(values);

        // THEN
        assertThat(values).containsExactly(0, 1, 1, 2, 4, 7, 9, 9);
    }

}
