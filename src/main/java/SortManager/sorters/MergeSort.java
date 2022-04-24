package SortManager.sorters;

import SortManager.controller.ArrayManager;
import SortManager.controller.SortManager;
import SortManager.display.DisplayManager;

public class MergeSort implements Sorter {
    public void sortArray() {

        long startTime = System.nanoTime();

        try{
            int[] unsortedArray = ArrayManager.getGeneratedArray();
            mergeSort(unsortedArray);

            long finishTime = System.nanoTime();

            ArrayManager.setSortedArray(unsortedArray);
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
        int leftIndex     = 0;
        int rightIndex    = 0;
        int mergedIndex   = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length)  {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                mergedArray[mergedIndex++] = leftArray[leftIndex++];
            } else {
                mergedArray[mergedIndex++] = rightArray[rightIndex++];
            }
        }

        while(leftIndex < leftArray.length) {
            mergedArray[mergedIndex++] = leftArray[leftIndex++];
        }

        while (rightIndex < rightArray.length)  {
            mergedArray[mergedIndex++] = rightArray[rightIndex++];
        }
    }
}

