package SortManager.sorters;

import SortManager.display.DisplayManager;

public class MergeSort extends ArrayManager implements Sorter {

    public MergeSort(int arraySize) {
        super(arraySize);
    }

    public void sortArray() {
        try{
            int[] unsortedArray = this.getGeneratedArray();
            mergeSort(unsortedArray);
            this.setSortedArray(unsortedArray);
            DisplayManager.printSortedArray(this.getSortedArray());
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

