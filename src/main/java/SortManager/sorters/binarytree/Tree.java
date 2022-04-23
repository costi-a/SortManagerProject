package SortManager.sorters.binarytree;

public class Tree {
    private TreeNode node;

    public Tree(int number) {
        node = new TreeNode(number);
    }

    public TreeNode getNode()   {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public TreeNode insertNode(TreeNode node, int numberIn) {
        if (node == null)   {
            return new TreeNode(numberIn);
        }

        else if (numberIn < node.getValue()) {
            node.setLeftNode(insertNode(node.getLeftNode(), numberIn));
        }

        else if (numberIn > node.getValue()) {
            node.setRightNode(insertNode(node.getRightNode(), numberIn));
        }

        return node;
    }

    public int traverseInOrder(TreeNode node, int[] array, int index)   {
        if (node.getLeftNode() != null) {
            index = traverseInOrder(node.getLeftNode(), array, index);
        }
        array[index++] = node.getValue();

        if (node.getRightNode() != null) {
            index = traverseInOrder(node.getRightNode(), array, index);
        }

        return index;
    }


}


