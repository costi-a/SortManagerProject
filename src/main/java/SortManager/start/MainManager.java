package SortManager.start;

import SortManager.view.DisplayManager;
import SortManager.controller.SortManager;


public class MainManager {
    public static void main(String[] args) {

        DisplayManager.printTitle();
        DisplayManager.printMenu();

        SortManager.getUserInput();

        SortManager.restartSorter();

    }
}
