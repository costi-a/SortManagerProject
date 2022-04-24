package SortManager.display;

import SortManager.controller.SortManager;

public abstract class DisplayManager {

    public static void printTitle() {
        System.out.println("\n\nSorting Manager Project\n" +
                        "-----------------------");
    }

    public static void printMenu()  {
        System.out.println("\nList of Sort Methods: \n" +
                        "---------------------\n" +
                "1.Bubble Sort (bubble)\n" +
                "2.Merge Sort (merge)\n"    +
                "3.Binary Tree Sort (btree)");
    }

    public static void printSortPrompt()    {
        System.out.println("\nWhich sorting algorithm would you like to use?");
    }

    public static void printSizePrompt()    {
        System.out.println("\nWhat size would you like the array to be?");
    }

    protected static void printArray(int[] array) {
        StringBuilder arrStr = new StringBuilder("[ ");
        for (int i = 0; i < array.length; i++)  {
            arrStr.append(array[i]);
            arrStr.append(", ");
        }
        arrStr.append("]");

        System.out.println(arrStr);

    }

    public static void printRandomArray(int[] array)    {
        System.out.println("Unsorted Array of Randomly Generated Numbers:   ");
        printArray(array);
    }

    public static void printSortedArray(int[] array)    {
        System.out.println("Sorted Array: ");
        printArray(array);
    }

    public static void printRestart()   {
        System.out.println("Would you like to try another?\n" +
                "Enter yes - Restart\n" +
                "Enter no - Exit"
        );
    }

    public static void printDuration()  {
        System.out.println("The Sort Duration was " + SortManager.getSortTime() + "nanoseconds");
    }

}
