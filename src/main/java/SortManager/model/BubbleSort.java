package SortManager.model;

import SortManager.controller.ArrayManager;
import SortManager.controller.SortManager;
import SortManager.view.DisplayManager;

public class BubbleSort implements Sorter  {
    @Override
    public void sortArray() {
        SortManager.logger.info("Calling BubbleSort method");

        long startTime = System.nanoTime();

        try {
            //get the generated unsorted array of ints
            int[] unsortedArray = ArrayManager.getGeneratedArray();

            int length = unsortedArray.length;
            int tempNum;

            //switch integers
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
            SortManager.logger.info("Bubble Sort completed successfully");

            //set sorted array and print
            ArrayManager.setSortedArray(unsortedArray);
            System.out.println("Bubble Sorted Array: ");
            SortManager.setSortTime(startTime, finishTime);
            DisplayManager.printSortedArray(ArrayManager.getSortedArray());
        } catch (Exception e)   {
            System.out.println("Sorry, Something went wrong.");
        }

    }

}


