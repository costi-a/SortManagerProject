package SortManager.model;

import SortManager.controller.ArrayManager;
import SortManager.controller.SortManager;
import SortManager.view.DisplayManager;

public class MergeSort implements Sorter {
    public void sortArray() {
        SortManager.logger.info("Calling MergeSort method");

        long startTime = System.nanoTime();

        try{
            int[] unsortedArray = ArrayManager.getGeneratedArray();
            mergeSort(unsortedArray);

            long finishTime = System.nanoTime();
            SortManager.logger.info("MergeSort completed successfully");

            ArrayManager.setSortedArray(unsortedArray);
            System.out.println("Merge Sorted Array");
            SortManager.setSortTime(startTime, finishTime);
            DisplayManager.printSortedArray(ArrayManager.getSortedArray());

        }catch (Exception e)    {
            System.out.println("Sorry, Something went wrong.");
        }
    }

    private static void mergeSort(int[] unsortedArray) {
        int arraySize = unsortedArray.length;

        if (arraySize < 2)  {
            return;
        }

        int midIndex = (arraySize / 2);

        int[] leftUnsortedArray     = new int[midIndex];
        int[] rightUnsortedArray    = new int[arraySize - midIndex];

        //split the array into two sub-arrays

        for (int i = 0; i < midIndex; i++)  {
            leftUnsortedArray[i] = unsortedArray[i];
        }
        for (int i = midIndex; i < arraySize; i++)  {
            rightUnsortedArray[i - midIndex] = unsortedArray[i];
        }

        mergeSort(leftUnsortedArray);
        mergeSort(rightUnsortedArray);

        mergeArrays(unsortedArray, leftUnsortedArray, rightUnsortedArray);

    }

    private static void mergeArrays(int[] mergedArray, int[] leftArray, int[] rightArray) {

        //store the current index position of the array
        int leftIndex     = 0;
        int rightIndex    = 0;
        int mergedIndex   = 0;

        //compare the sub-arrays until the end of the arrays
        while (leftIndex < leftArray.length && rightIndex < rightArray.length)  {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                mergedArray[mergedIndex++] = leftArray[leftIndex++];
            } else {
                mergedArray[mergedIndex++] = rightArray[rightIndex++];
            }
        }

        //if we haven't reached the end of the leftArray,
        // fill the merged array with the rest of the numbers
        while(leftIndex < leftArray.length) {
            mergedArray[mergedIndex++] = leftArray[leftIndex++];
        }

        //if we haven't reached the end of the rightArray,
        // fill the merged array with the rest of the numbers
        while (rightIndex < rightArray.length)  {
            mergedArray[mergedIndex++] = rightArray[rightIndex++];
        }
    }
}

