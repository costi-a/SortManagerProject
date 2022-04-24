package SortManager.sorters.binarytree;

import SortManager.controller.ArrayManager;
import SortManager.sorters.BubbleSort;
import SortManager.sorters.Sorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeSortTest {
    public Sorter sorter;

    @BeforeEach
    public void setUp() {
        sorter = new BinaryTreeSort();

    }

    @Test
    @DisplayName("Expected Fail for Duplicate element")
    void testBinarySortUnsorted() {
        int[] expected = {28, 41, 55, 64, 82, 103, 121, 123, 134, 165, 173, 181, 223, 253, 256, 259, 283, 296, 300, 302, 304, 340, 345, 415, 419};
        int[] actual = {253, 223, 41, 103, 259, 419, 28, 345, 123, 296, 283, 55, 415, 64, 121, 181, 300, 134, 82, 165, 256, 304, 340, 302, 173};
        ArrayManager.setArray(actual);
        sorter.sortArray();
        int[] actualSorted = ArrayManager.getSortedArray();
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    @DisplayName("Test an array of sorted ints")
    void testBinarySortSorted() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {1,2,3,4,5};
        ArrayManager.setArray(actual);
        sorter.sortArray();
        int[] actualSorted = ArrayManager.getSortedArray();
        assertArrayEquals(expected, actualSorted);
    }

}