package SortManager.controller;

import SortManager.display.DisplayManager;
import SortManager.sorters.BubbleSort;
import SortManager.sorters.MergeSort;
import SortManager.sorters.binarytree.BinaryTreeSort;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class SortManager {

    static long sortDuration;

    public static void getSorter(String chosenSorter, int arraySize)    {
        switch(chosenSorter)    {
            case "bubble" ->  {
                System.out.println("You are using Bubble Sort!");
                new ArrayManager(arraySize);
                BubbleSort bs = new BubbleSort();
                bs.sortArray();
            }
            case "merge" ->   {
                System.out.println("You are using Merge Sort!");
                new ArrayManager(arraySize);
                MergeSort ms = new MergeSort();
                ms.sortArray();
            }
            case "btree" -> {
                System.out.println("You are using Binary Tree Sort!");

                new ArrayManager(arraySize);
                BinaryTreeSort bts = new BinaryTreeSort();
                bts.sortArray();
            }
            default -> {
                System.out.println("Please Choose a Sorter from the List");
            }
        }
    }

    public static void getUserInput()   {
        Scanner scan = new Scanner(System.in);

        String userInputS = "";
        int userInputN = 0;


        boolean suitableSortResponse = false;
        boolean suitableSizeResponse = false;


        while (!suitableSortResponse) {

            DisplayManager.printSortPrompt();

            try {
                userInputS = scan.next();
                if (userInputS.equals("bubble") || userInputS.equals("merge") || userInputS.equals("btree")) {
                    suitableSortResponse = true;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Sorry Please Input a Valid Sorter");
            }
        }

        while (!suitableSizeResponse) {

            DisplayManager.printSizePrompt();

            try {
                userInputN = scan.nextInt();
                suitableSizeResponse = true;
            } catch (InputMismatchException | ArithmeticException e) {
                System.out.println("Sorry Please Input a Valid Integer");
            }
        }

        SortManager.getSorter(userInputS, userInputN);

    }

    public static void exitSorter() {
        System.out.println("EXITING");
        System.exit(0);
    }

    public static void restartSorter()  {
        DisplayManager.printRestart();
        Scanner scan = new Scanner(System.in);
        if (Objects.equals(scan.nextLine(), "yes")) {
            DisplayManager.printTitle();
            DisplayManager.printMenu();
            SortManager.getUserInput();
        } else if (Objects.equals(scan.nextLine(), "no")) {
            exitSorter();
        }
        restartSorter();
    }

    public static void setSortTime(long startTime, long finishTime)   {
         long duration = finishTime - startTime;
         sortDuration = duration;
         DisplayManager.printDuration();
    }

    public static long getSortTime()   {
        return sortDuration;
    }
}
