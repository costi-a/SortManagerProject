package SortManager.controller;

import SortManager.display.DisplayManager;
import SortManager.sorters.SortManager;


public class MainMan {
    public static void main(String[] args) {

        DisplayManager.printTitle();
        DisplayManager.printMenu();

        SortManager.getUserInput();

        SortManager.restartSorter();

    }
}
