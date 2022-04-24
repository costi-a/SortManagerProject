package SortManager.sorters;

import SortManager.controller.ArrayManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private BubbleSort bs = new BubbleSort();

    @BeforeEach
    void setUp() {
        new ArrayManager(8);

    }

    @Test
    void testSortArray() {
        bs.sortArray();

    }
}