package SortManager;

import java.util.Arrays;
import java.util.Scanner;
public class SortManager  {

    private static int size;


    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = s.nextInt();

        int[] randomEx = GenerateArray.generateRandom(size);

        System.out.println(Arrays.toString(randomEx));

        ArraySorter.bubbleSort(randomEx);
        System.out.println("BUBBLE SORT" + Arrays.toString(randomEx));

        ArraySorter.mergeSort(randomEx, 0, randomEx.length - 1);
        System.out.println("MERGE SORT" + Arrays.toString(randomEx));
    }
}
