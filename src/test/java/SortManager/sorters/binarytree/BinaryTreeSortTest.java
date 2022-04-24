package SortManager.sorters.binarytree;

import SortManager.controller.ArrayManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeSortTest {

    @BeforeEach
    void setUp() {
        new ArrayManager(8);
    }

    @Test
    void testSortArray() {
        BinaryTreeSort bts = new BinaryTreeSort();
        bts.sortArray();
    }
}