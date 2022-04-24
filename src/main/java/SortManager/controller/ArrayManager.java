package SortManager.controller;

import SortManager.display.DisplayManager;
import SortManager.sorters.Sorter;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayManager implements Sorter {
    private static int[] generatedArray;
    private static int[] sortedArray;

    public ArrayManager(int arraySize) {
        Random randomNum = new Random();
        IntStream stream = randomNum.ints(arraySize, 0, 1000);
        int[] randomArray = stream.toArray();

        this.generatedArray = randomArray;
        DisplayManager.printRandomArray(this.getGeneratedArray());
    }

    public static int[] setArray(int[] array)  {
        ArrayManager.generatedArray = array;
        return array;
    }

    public static int[] getGeneratedArray() {
        return generatedArray;
    }

    public static int[] getSortedArray() {
        return sortedArray;
    }

    public static void setSortedArray(int[] sortedArray) {
        ArrayManager.sortedArray = sortedArray;
    }

    public void sortArray() {

    }
}
