package SortManager.sorters;

import static java.util.Collections.swap;

public class BubbleSort implements Sorter{
    @Override
    public void sort(int[] arrayS) {
            boolean sorted = false;
            for (int j = 0; j < arrayS.length - 1; j++)  {
                for (int i = 0; i < arrayS.length - j - 1; i++) {
                    if (arrayS[i] > arrayS[i + 1]) {
                        swap(arrayS, i, i+1);
                        sorted = true;
                    } else if (!sorted) {
                        break;
                    }
                }
                }

}

    private void swap(int[] arrayS, int x, int y) {
        int swapVal = arrayS[x];
        arrayS[x] = arrayS[y];
        arrayS[y] = swapVal;
    }
    }


