package SortManager.sorters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private MergeSort ms;

    @BeforeEach
    void setUp() {
        ms = new MergeSort(8);
    }

    @Test
    void testSortArray() {
        ms.sortArray();
    }
}