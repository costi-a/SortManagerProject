package SortManager.sorters.binarytree;

public class TreeNode {
    int value;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    TreeNode(int value) {
        this.value = value;
        leftNode = null;
        rightNode = null;
    }

    public int getValue() {
        return value;
    }
}
