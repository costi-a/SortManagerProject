package SortManager.view;

import org.junit.jupiter.api.Test;

class DisplayManagerTest {
    private DisplayManager dm;

    @Test
    void testPrintTitle() {

        dm.printTitle();
        dm.printSortPrompt();
        dm.printSizePrompt();

    }

    @Test
    void testPrintArray()   {
        int[] testArray = {24, 34, 67, 89};

        dm.printArray(testArray);
    }


}