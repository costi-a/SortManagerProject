package SortManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayManagerTest {

    private ArrayManager am;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up array manager");
        am = new ArrayManager(4);
    }


    @Test
    void testPrintRandomArray() {
        am.printRandomArray();

    }

    private void printRandomArray() {
    }
}