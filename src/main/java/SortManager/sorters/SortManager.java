package SortManager.sorters;

import SortManager.display.DisplayManager;
import SortManager.sorters.binarytree.BinaryTreeSort;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

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
                BinaryTreeSort bts = new BinaryTreeSort(arraySize);
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
        if (Objects.equals(scan.next(), "yes")) {
            DisplayManager.printTitle();
            DisplayManager.printMenu();
            SortManager.getUserInput();
            restartSorter();
        }
        else if(Objects.equals(scan.next(), "no"))   {
            exitSorter();
        }
    }
}
