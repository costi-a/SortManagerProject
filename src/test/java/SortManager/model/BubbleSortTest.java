package SortManager.model;

import SortManager.controller.ArrayManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    public Sorter sorter;

    @BeforeEach
    public void setUp() {
        sorter = new BubbleSort();

    }

    @Test
    @DisplayName("Test an array of unsorted ints")
    void testBubbleSortUnsorted() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {2,5,1,3,4};
        ArrayManager.setArray(actual);
        sorter.sortArray();
        int[] actualSorted = ArrayManager.getSortedArray();
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    @DisplayName("Test an array of sorted ints")
    void testBubbleSortSorted() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {1,2,3,4,5};
        ArrayManager.setArray(actual);
        sorter.sortArray();
        int[] actualSorted = ArrayManager.getSortedArray();
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    @DisplayName("Test an array of duplicate ints")
    void testBubbleSortDuplicates() {
        int[] expected = {2,2,3,3,4};
        int[] actual = {2,3,4,3,2};
        ArrayManager.setArray(actual);
        sorter.sortArray();
        int[] actualSorted = ArrayManager.getSortedArray();
        assertArrayEquals(expected, actualSorted);
    }

    @Test
    @DisplayName("Test an array of null ints")
    void testBubbleSortNull() {
        int[] expected = {};
        int[] actual = {};
        ArrayManager.setArray(actual);
        sorter.sortArray();
        int[] actualSorted = ArrayManager.getSortedArray();
        assertArrayEquals(expected, actualSorted);
    }
}