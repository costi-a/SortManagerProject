package SortManager.display;

import SortManager.ArrayManager;

public abstract class DisplayManager {

    public static void printTitle() {
        System.out.println("\n\nSorting Manager Project\n" +
                        "-----------------------");
        DisplayManager.printMenu();
    }

    public static void printMenu()  {
        System.out.println("\nList of Sort Methods: \n" +
                        "---------------------\n" +
                "1.Bubble Sort (bubble)\n" +
                "2.Merge Sort (merge)");
    }

    public static void printSortPrompt()    {
        System.out.println("\nWhich sorting algorithm would you like to use?");
    }

    public static void printSizePrompt()    {
        System.out.println("\nWhat size would you like the array to be?");
    }

}
