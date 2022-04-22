package SortManager;

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
        printRandomArray();
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

    public void printRandomArray() {
        System.out.println("Unsorted Array of Randomly Generated Numbers:   ");
        for (int index : this.getGeneratedArray()) {
            System.out.printf("%d, ", index);
        }
        System.out.println(" \n ");

    }

    public void printSortedArray() {
        if (this.getSortedArray() != null) {
            System.out.println("Sorted Array : ");
            for (int index : this.getSortedArray()) {
                System.out.printf("%d, ", index);
            }
        }
    }

    public void sortArray() {

    }
}
