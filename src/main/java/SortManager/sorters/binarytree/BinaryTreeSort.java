package SortManager.sorters.binarytree;

import SortManager.controller.SortManager;
import SortManager.display.DisplayManager;
import SortManager.controller.ArrayManager;
import SortManager.sorters.Sorter;

public class BinaryTreeSort implements Sorter {
    public void sortArray() {

        SortManager.logger.info("Calling Binary Tree Sort method");

        long startTime = System.nanoTime();


        try{
            int[] unsortedArray = ArrayManager.getGeneratedArray();
            int index = 0;
            //create a tree root node at the start of the unsorted array
            Tree btree = new Tree(unsortedArray[0]);
            for (int value : unsortedArray) {
                //insert each value of the array onto the tree
                btree.insert(btree.getNode(), value);
            }

            //traverse the tree and sort
            btree.traverseInOrder(btree.getNode(), unsortedArray, index);

            long finishTime = System.nanoTime();

            SortManager.logger.info("binary tree sort completed successfully");

            ArrayManager.setSortedArray(unsortedArray);
            System.out.println("Binary Tree Sorted Array");
            SortManager.setSortTime(startTime, finishTime);
            DisplayManager.printSortedArray(ArrayManager.getSortedArray());

        }catch (Exception e)    {
            System.out.println("Sorry, Something went wrong.");
        }
    }
}
