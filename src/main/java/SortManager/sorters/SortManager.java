package SortManager.sorters;

public class SortManager {
    public static void getSorter(String chosenSorter, int arraySize)    {
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
            case "btree" -> {
                System.out.println("You are using Binary Tree Sort!");
            }
            default -> {
                System.out.println("Please Choose a Sorter from the List");
            }
        }
    }
}
