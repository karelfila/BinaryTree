public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(7);

        Node result = tree.search(7);

        if (result != null) {
            System.out.println("Value found: " + result.value);
        } else {
            System.out.println("Value not found");
        }


        System.out.println("Ordered list:");
        tree.printInOrder();

        System.out.println("Depth of the binary tree: " + tree.depth());
    }

}

