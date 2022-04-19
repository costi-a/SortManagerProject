package SortManager;

import java.util.Arrays;

public class SortManager {

    public static void main(String[] args)  {
        int[] randomEx = GenerateArray.generateRandom(100);

        System.out.println(Arrays.toString(randomEx));

        ArraySorter.bubbleSort(randomEx, 100);
        System.out.println("BUBBLE SORT" + Arrays.toString(randomEx));

        ArraySorter.mergeSort(randomEx, 0, randomEx.length - 1);
        System.out.println("MERGE SORT" + Arrays.toString(randomEx));
    }
}
