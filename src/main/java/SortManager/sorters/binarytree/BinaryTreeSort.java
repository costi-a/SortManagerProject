package SortManager.sorters.binarytree;

import SortManager.display.DisplayManager;
import SortManager.controller.ArrayManager;
import SortManager.sorters.Sorter;

public class BinaryTreeSort implements Sorter {
    public void sortArray() {


        try{
            int[] unsortedArray = ArrayManager.getGeneratedArray();
            int index = 0;

            Tree btree = new Tree(unsortedArray[0]);
            for (int value : unsortedArray) {
                btree.insert(btree.getNode(), value);
            }

            btree.traverseInOrder(btree.getNode(), unsortedArray, index);

            ArrayManager.setSortedArray(unsortedArray);
            DisplayManager.printSortedArray(ArrayManager.getSortedArray());
        }catch (Exception e)    {
            System.out.println("Sorry, Something went wrong.");
        }
    }
}
