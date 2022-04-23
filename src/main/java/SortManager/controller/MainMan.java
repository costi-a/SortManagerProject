package SortManager.controller;

import SortManager.display.DisplayManager;
import SortManager.sorters.SortManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInputS = "";
        int userInputN = 0;


        boolean suitableSortResponse = false;
        boolean suitableSizeResponse = false;

        DisplayManager.printTitle();

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
}
