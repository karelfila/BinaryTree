public class BinaryTree {

    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }

        return node;
    }

    public Node search(int value) {
        return searchRecursive(root, value);
    }

    private Node searchRecursive(Node node, int value) {
        if (node == null || node.value == value) {
            return node;
        }

        if (value < node.value) {
            return searchRecursive(node.left, value);
        }

        return searchRecursive(node.right, value);
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.value + " ");
            printInOrder(node.right);
        }
    }

    private int calculateDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = calculateDepth(node.left);
            int rightDepth = calculateDepth(node.right);

            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public int depth() {
        return calculateDepth(root);
    }

}


