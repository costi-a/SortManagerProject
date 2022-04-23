package SortManager.sorters.binarytree;

import SortManager.display.DisplayManager;
import SortManager.sorters.ArrayManager;
import SortManager.sorters.Sorter;

public class BinaryTreeSort extends ArrayManager implements Sorter {
    public BinaryTreeSort(int arraySize) {
        super(arraySize);
    }

    public void sortArray() {


        try{
            int[] unsortedArray = this.getGeneratedArray();
            int index = 0;

            Tree btree = new Tree(unsortedArray[0]);
            for (int value : unsortedArray) {
                btree.insertNode(btree.getNode(), value);
            }

            btree.traverseInOrder(btree.getNode(), unsortedArray, index);

            this.setSortedArray(unsortedArray);
            DisplayManager.printSortedArray(this.getSortedArray());
        }catch (Exception e)    {
            System.out.println("Sorry, Something went wrong.");
        }
    }
}
