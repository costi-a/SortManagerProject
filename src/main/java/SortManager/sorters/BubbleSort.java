package SortManager.sorters;

import SortManager.controller.ArrayManager;
import SortManager.controller.SortManager;
import SortManager.display.DisplayManager;

public class BubbleSort implements Sorter  {
    @Override
    public void sortArray() {

        long startTime = System.nanoTime();

        try {
            int[] unsortedArray = ArrayManager.getGeneratedArray();

            int length = unsortedArray.length;
            int tempNum;

            for (int i = 0; i < length; i++) {
                for (int j = 1; j < (length - i); j++) {
                    if (unsortedArray[j - 1] > unsortedArray[j]) {
                        tempNum = unsortedArray[j - 1];
                        unsortedArray[j - 1] = unsortedArray[j];
                        unsortedArray[j] = tempNum;
                    }
                }
            }
            long finishTime = System.nanoTime();
            ArrayManager.setSortedArray(unsortedArray);
            SortManager.setSortTime(startTime, finishTime);
            DisplayManager.printSortedArray(ArrayManager.getSortedArray());
        } catch (Exception e)   {
            System.out.println("Sorry, Something went wrong.");
        }

    }

}


