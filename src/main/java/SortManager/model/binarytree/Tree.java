package SortManager.model.binarytree;

public class Tree {
    static Node node;

    public Tree(int number) {
        node = new Node(number);
    }

    public Node getNode() {
        return node;
    }

    public static class Node    {
        int value;
        Node leftNode;
        Node rightNode;
        public Node(int value) {
            this.value = value;
            leftNode = null;
            rightNode = null;
        }
        public int getValue() {
            return value;
        }

        public void setLeftNode(Node node) {
            this.leftNode = node;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setRightNode(Node node) {
            this.rightNode = node;
        }

        public Node getRightNode() {
            return rightNode;
        }
    }

    public Node insert(Node node, int numberIn) {

        if (node == null)   {
            return new Node(numberIn);
        }

        if (numberIn < node.getValue()) {
            node.setLeftNode(insert(node.getLeftNode(), numberIn));
        }
        if (numberIn > node.getValue()) {
            node.setRightNode(insert(node.getRightNode(), numberIn));
        }
        return node;
    }

    public int traverseInOrder(Node node, int[] array, int index) {

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


