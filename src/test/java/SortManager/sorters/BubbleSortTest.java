package SortManager.sorters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private BubbleSort bs;

    @BeforeEach
    void setUp() {
        bs = new BubbleSort(8);

    }

    @Test
    void testSortArray() {
        bs.sortArray();

    }
}