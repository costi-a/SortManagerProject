package SortManager;

import SortManager.sorters.SortManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortManagerTest {

    private SortManager sm;

    @BeforeEach
    void setUp() {


    }

    @Test
    void testGetSorter() {
        int arrayLength = 10;
        String sort = "merge";
        sm.getSorter(sort, arrayLength);

    }
}