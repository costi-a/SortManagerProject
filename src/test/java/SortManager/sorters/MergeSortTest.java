package SortManager.sorters;

import SortManager.controller.ArrayManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private MergeSort ms = new MergeSort();

    @BeforeEach
    void setUp() {
        new ArrayManager(8);
    }

    @Test
    void testSortArray() {
        ms.sortArray();
    }
}