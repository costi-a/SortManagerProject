package SortManager.display;

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


}