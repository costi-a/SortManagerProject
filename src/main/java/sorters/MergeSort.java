package sorters;

public class MergeSort implements Sorter {

    public void sort(int[] arrayS) {
            mergeSort(arrayS[0], arrayS.length);
            
    }


    private static void mergeSort(int leftIn, int rightIn) {
        if (rightIn <= leftIn) return;

        int mid = (leftIn + rightIn) / 2;
        mergeSort(leftIn, mid);
        mergeSort((mid + 1), rightIn);
        merge(leftIn, mid, rightIn);
    }

    private static void merge(int left, int mid, int right) {

        int leftArray[] = new int[mid - left + 1];
        int rightArray[] = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = leftArray[left + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = leftArray[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    leftArray[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    leftArray[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                leftArray[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                leftArray[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}

