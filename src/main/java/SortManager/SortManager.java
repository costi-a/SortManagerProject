package SortManager;

import SortManager.sorters.BubbleSort;
import SortManager.sorters.MergeSort;

public class SortManager {
    public static ArrayManager getSorter(String chosenSorter, int arraySize)    {
        switch(chosenSorter)    {
            case "bubble" ->  {
                System.out.println("You are using Bubble Sort!");
                BubbleSort bs = new BubbleSort(arraySize);
                bs.sortArray();
            }
            case "merge" ->   {
                System.out.println("You are using Merge Sort!");
                MergeSort ms = new MergeSort(arraySize);
                ms.sortArray();
            }
            default -> {
                return null;
            }
        }
        return null;
    }
}
