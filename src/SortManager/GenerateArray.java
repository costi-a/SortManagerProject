package SortManager;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenerateArray {


    public static int[] generateRandom(int size)    {
        Random randomNum = new Random();
        IntStream stream = (IntStream) randomNum.ints(size, 0, 10000);
        int numberArray[] = stream.toArray();

        return numberArray;
    }


    public static void main(String[] args)  {
        int[] randomEx = generateRandom(100);

        System.out.println(Arrays.toString(randomEx));

        ArraySorter.bubbleSort(randomEx, 100);
        System.out.println("BUBBLE SORT" + Arrays.toString(randomEx));
    }

}
