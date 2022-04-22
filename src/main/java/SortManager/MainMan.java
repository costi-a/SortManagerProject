package SortManager;

import SortManager.display.DisplayManager;

import java.util.Scanner;

public class MainMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInputS = "";
        int userInputN = 0;

        DisplayManager.printTitle();
        DisplayManager.printSortPrompt();

        try {
            userInputS = scan.next();
        } catch (Exception e) {
            System.out.println("Sorry, Please Input a Valid Sorting Algorithm.");
        }
        DisplayManager.printSizePrompt();
        try {
            userInputN = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry, Please Input a Valid Integer.");
        }
        try {
            SortManager.getSorter(userInputS, userInputN);
        } catch (Exception e) {
            System.out.println("Sorry, An Error has Occurred.");
        }
    }
}
