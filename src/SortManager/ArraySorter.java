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

    public static void mergeSort(int[] arrayS, int low, int high)    {
        if(high <= low) return;

        int mid = (low + high)/2;
        mergeSort(arrayS, low, mid);
        mergeSort(arrayS, mid+1, high);
        merge(arrayS, low, mid, high);
    }

    public static void merge(int[] arrayS, int low, int mid, int high)  {

        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = arrayS[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = arrayS[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < high + 1; i++)
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arrayS[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arrayS[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                arrayS[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                arrayS[i] = rightArray[rightIndex];
                rightIndex++;
            }
    }
}
