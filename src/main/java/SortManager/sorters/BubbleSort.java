package SortManager.sorters;

import SortManager.ArrayManager;

public class BubbleSort extends ArrayManager implements Sorter  {
    public BubbleSort(int arraySize) {
        super(arraySize);
    }

    @Override
    public void sortArray() {
        int[] unsortedArray = this.getGeneratedArray();

        int length = unsortedArray.length;
        int tempNum;

        for (int i = 0; i < length; i++)    {
            for(int j = 1; j < (length - i); j++)   {
                if (unsortedArray[j - 1] > unsortedArray[j])    {
                    tempNum = unsortedArray[j - 1];
                    unsortedArray[j - 1] = unsortedArray[j];
                    unsortedArray[j] = tempNum;
                }
            }
        }

        this.setSortedArray(unsortedArray);
        this.printSortedArray();

    }

}


