package SortManager.controller;

import SortManager.sorters.SortManager;
import SortManager.display.DisplayManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInputS = "";
        int userInputN = 0;

        DisplayManager.printTitle();
        DisplayManager.printSortPrompt();

        userInputS = scan.next();

        DisplayManager.printSizePrompt();

        try {
            userInputN = scan.nextInt();
            SortManager.getSorter(userInputS, userInputN);
        }catch (Exception e) {
            System.out.println("Sorry, Please Try Again");

        }

    }
}
