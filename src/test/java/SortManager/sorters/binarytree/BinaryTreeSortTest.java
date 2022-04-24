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
    @DisplayName("Test an array of unsorted ints")
    void testBinarySortUnsorted() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {2,5,4,3,1};
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


    @Test
    @DisplayName("Test an array of null ints")
    void testBinarySortNull() {
        int[] expected = { };
        int[] actual = { };
        ArrayManager.setArray(actual);
        sorter.sortArray();
        int[] actualSorted = ArrayManager.getSortedArray();
        assertArrayEquals(expected, actualSorted);
    }
}