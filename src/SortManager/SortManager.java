package SortManager;

import SortManager.sorters.BubbleSort;
import SortManager.sorters.Sorter;

import java.util.Arrays;
import java.util.Scanner;
public class SortManager extends GenerateArray  {

    public static void test(Sorter sr)  {
        final int[] randomTester = generateRandom(getArraySize());
        printArray(randomTester);
        sr.sort(randomTester);
        printArray(randomTester);
    }




    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter the size of the array");
        int size = 10;
        setArraySize(size);


        //int[] randomEx = GenerateArray.generateRandom(size);

        test(new BubbleSort());



        //BubbleSort bs = new BubbleSort();
        System.out.println("BUBBLE SORT");

        //ArraySorter.mergeSort(randomEx, 0, randomEx.length - 1);
        //System.out.println("MERGE SORT" + Arrays.toString(randomEx));
    }
}
