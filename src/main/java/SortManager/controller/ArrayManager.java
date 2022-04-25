package SortManager.controller;

import SortManager.view.DisplayManager;
import SortManager.model.Sorter;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayManager implements Sorter {
    private static int[] generatedArray;
    private static int[] sortedArray;

    //generate an array of random numbers of a given size
    public ArrayManager(int arraySize) {
        Random randomNum = new Random();
        IntStream stream = randomNum.ints(arraySize, 0, 1000);
        int[] randomArray = stream.toArray();

        this.generatedArray = randomArray;
        DisplayManager.printRandomArray(this.getGeneratedArray());
    }

    //set up an array for testing purposes
    public static int[] setArray(int[] array)  {
        ArrayManager.generatedArray = array;
        return array;
    }

    //getters and setters for the generated and sorted arrays
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
