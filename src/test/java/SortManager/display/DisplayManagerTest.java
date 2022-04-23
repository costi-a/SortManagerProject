package SortManager.display;

import SortManager.sorters.ArrayManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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