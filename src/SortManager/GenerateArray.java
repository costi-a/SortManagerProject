package SortManager;

import java.util.Random;
import java.util.stream.IntStream;

public class GenerateArray {

    public static int getArraySize() {
        return arraySize;
    }

    public static void setArraySize(int arraySize) {
        GenerateArray.arraySize = arraySize;
    }

    private static int arraySize;



    public static int[] generateRandom(int size)    {
        Random randomNum = new Random();
        IntStream stream = (IntStream) randomNum.ints(size, 0, 10000);
        int numberArray[] = stream.toArray();

        return numberArray;
    }

    public static void printArray(int[] array) {
        System.out.println(" ");
        for(int i = 0 ; i < getArraySize() ; i++)
            System.out.print(array[i] + " ,");
    }


}
