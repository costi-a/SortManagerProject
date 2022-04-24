package SortManager.controller;

import SortManager.display.DisplayManager;
import SortManager.sorters.BubbleSort;
import SortManager.sorters.MergeSort;
import SortManager.sorters.binarytree.BinaryTreeSort;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortManager {

    public static Logger logger = LogManager.getLogger("Logger");

    static long sortDuration;

    public static void getSorter(String chosenSorter, int arraySize)    {
        // switch between the sorting algorithms
        switch(chosenSorter)    {
            case "bubble" ->  {
                //handle bubble sort operation
                System.out.println("You are using Bubble Sort!");
                logger.info("User has chosen to use bubble sort");
                new ArrayManager(arraySize);
                BubbleSort bs = new BubbleSort();
                bs.sortArray();
            }
            case "merge" ->   {
                //handle merge sort operation
                System.out.println("You are using Merge Sort!");
                logger.info("User has chosen to use merge sort");
                new ArrayManager(arraySize);
                MergeSort ms = new MergeSort();
                ms.sortArray();
            }
            case "btree" -> {
                //handle binary search tree operation
                System.out.println("You are using Binary Tree Sort!");
                logger.info("User has chosen to use binary tree sort");
                new ArrayManager(arraySize);
                BinaryTreeSort bts = new BinaryTreeSort();
                bts.sortArray();
            }
            case "compare" ->   {
                //handle the sort comparisons
                System.out.println("You are comparing Sort Algorithms");
                logger.info("User has chosen to compare the sorters");
                new ArrayManager(arraySize);
                BubbleSort bs = new BubbleSort();
                bs.sortArray();
                MergeSort ms = new MergeSort();
                ms.sortArray();
                BinaryTreeSort bts = new BinaryTreeSort();
                bts.sortArray();
            }
            default -> {
                System.out.println("Please Choose a Sorter from the List");
            }
        }
    }

    //get the users keyboard input using scanner
    public static void getUserInput()   {
        Scanner scan = new Scanner(System.in);

        String userInputS = "";
        int userInputN = 0;


        boolean suitableSortResponse = false;
        boolean suitableSizeResponse = false;

        //check the user is inputting a valid sorter
        while (!suitableSortResponse) {

            DisplayManager.printSortPrompt();

            try {
                userInputS = scan.next();
                if (userInputS.equals("bubble") || userInputS.equals("merge") ||
                        userInputS.equals("btree") || userInputS.equals("compare")) {
                    suitableSortResponse = true;
                    logger.info("Suitable response received for sorter");
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Sorry Please Input a Valid Sorter");
                logger.info("Invalid user input for choosing sorter");
            }
        }
        //check the user is inputting a valid array size
        while (!suitableSizeResponse) {

            DisplayManager.printSizePrompt();

            try {
                userInputN = scan.nextInt();
                suitableSizeResponse = true;
                logger.info("Suitable response received for array size");
            } catch (InputMismatchException | ArithmeticException e) {
                System.out.println("Sorry Please Input a Valid Integer");
                logger.info("Invalid integer response for array size");
            }
        }

        SortManager.getSorter(userInputS, userInputN);

    }

    public static void exitSorter() {
        // exit the sort manager
        System.out.println("EXITING");
        logger.info("user is exiting the sort manager");
        System.exit(0);
    }

    public static void restartSorter()  {
        // restart the sort manager
        DisplayManager.printRestart();
        Scanner scan = new Scanner(System.in);
        if (Objects.equals(scan.nextLine(), "yes")) {
            logger.info("user is restarting the sort manager");
            DisplayManager.printTitle();
            DisplayManager.printMenu();
            SortManager.getUserInput();
        } else if (Objects.equals(scan.nextLine(), "no")) {
            exitSorter();
        }
        restartSorter();
    }

    public static void setSortTime(long startTime, long finishTime)   {
        //set the sorting duration
         long duration = finishTime - startTime;
         logger.info("calculating sort duration");
         sortDuration = duration;
         DisplayManager.printDuration();
    }

    public static long getSortTime()   {
        return sortDuration;
    }
}
