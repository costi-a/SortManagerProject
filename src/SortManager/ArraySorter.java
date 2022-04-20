package SortManager;

public class ArraySorter {

    public static void bubbleSort(int[] arrayS) {
        boolean sorted = false;
        int swap;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrayS.length - 1; i++)
                if (arrayS[i] > arrayS[i + 1]) {
                    swap = arrayS[i];
                    arrayS[i] = arrayS[i + 1];
                    arrayS[i + 1] = swap;
                    sorted = false;
                }

        }
    }

    public static void mergeSort(int[] arrayS, int left, int right)    {
        if(right <= left) return;

        int mid = (left + right)/2;
        mergeSort(arrayS, left, mid);
        mergeSort(arrayS, mid + 1, right);
        merge(arrayS, left, mid, right);
    }

    private static void merge(int[] arrayS, int left, int mid, int right)  {

        int leftArray[] = new int[mid - left + 1];
        int rightArray[] = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = arrayS[left + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = arrayS[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++)
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
