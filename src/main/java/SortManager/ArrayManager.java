package SortManager;

import sorters.Sorter;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayManager implements Sorter {
    private int[] generatedArray;
    private int[] sortedArray;

    private static int arraySize;


    public ArrayManager(int size)    {
        Random randomNum = new Random();
        IntStream stream = randomNum.ints(size, 0, 1000);
        int[] randomArray = stream.toArray();

        this.generatedArray = randomArray;
    }

    public int[] getGeneratedArray()    { return generatedArray; }

    public int[] getSortedArray()   { return sortedArray; }

    public void setSortedArray(int[] sortedArray)   {
        this.sortedArray = sortedArray;
    }

    public void printRandomArray()   {
        System.out.println(" Unsorted Array of Randomly Generated Numbers:   ");
        for(int index: this.getGeneratedArray())   {
            System.out.printf(index + " , ");
        }
        System.out.println(" \n ");

    }

}
