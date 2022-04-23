package SortManager.controller;

import SortManager.display.DisplayManager;
import SortManager.sorters.Sorter;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayManager implements Sorter {
    private int[] generatedArray;
    private int[] sortedArray;

    public ArrayManager(int arraySize) {
        Random randomNum = new Random();
        IntStream stream = randomNum.ints(arraySize, 0, 1000);
        int[] randomArray = stream.toArray();

        this.generatedArray = randomArray;
        DisplayManager.printRandomArray(this.getGeneratedArray());
    }

    public int[] getGeneratedArray() {
        return generatedArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public void sortArray() {

    }
}
