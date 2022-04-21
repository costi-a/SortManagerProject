package SortManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayManagerTest {

    private ArrayManager am;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up array manager");
    }


    @Test
    void testRandomArray() {
        am = new ArrayManager(4);
        am.printRandomArray();

    }


}