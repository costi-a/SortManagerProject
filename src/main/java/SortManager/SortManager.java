package SortManager;

import SortManager.sorters.BubbleSort;
import SortManager.sorters.MergeSort;

public class SortManager {
    public static ArrayManager getSorter(String chosenSorter, int arraySize)    {
        switch(chosenSorter)    {
            case "bubble":  {
                return new BubbleSort(arraySize);
            }
            case "merge":   {
                return new MergeSort(arraySize);
            }
            default:
                return null;
        }
    }
}
