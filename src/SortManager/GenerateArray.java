package SortManager;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class GenerateArray {


    public static int[] generateRandom(int size)    {
        Random randomNum = new Random();
        IntStream stream = (IntStream) randomNum.ints(size, 0, 10000);
        int numberArray[] = stream.toArray();

        return numberArray;
    }

}
