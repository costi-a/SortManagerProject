package SortManager;

public class ArraySorter {

    public static void bubbleSort(int[] arrayS, int size)  {
        for (int i = 0; i < size-1; i++)
            for (int j = 0; j < size - i - 1; ++j)

                if (arrayS[j + 1] < arrayS[j]) {

                    var swap = arrayS[j];
                    arrayS[j] = arrayS[j + 1];
                    arrayS[j + 1] = swap;
                }
    }

    public static void mergeSort(int[] arrayS, int size)    {

    }
}
