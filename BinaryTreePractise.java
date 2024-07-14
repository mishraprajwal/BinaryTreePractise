import java.util.Scanner;

public class BinaryTreePractise {
    static Node root;
    public static void main(String[] args) {
        BinaryTreePractise binaryTree = new BinaryTreePractise();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of nodes in the binary tree:");
            int numberOfNodes = scanner.nextInt();
            System.out.println("Enter the elements of the nodes:");
            for (int i = 0; i < numberOfNodes; i++) {
                binaryTree.insert(scanner.nextInt());
            }

        System.out.println("Inorder traversal for binary Tree:");
        displayInorder(root);

        System.out.println("Preorder traversal for binary Tree:");
        displayPreorder(root);

        System.out.println("Postorder traversal for binary Tree:");
        displayPostorder(root);

        }
    }
    
    public Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    public static void displayInorder(Node node) {
        if (node != null) {
            displayInorder(node.left);
            System.out.println("" + node.value);
            displayInorder(node.right);
        }
    }
    
    public static void displayPreorder(Node node) {
        if (node != null) {
            System.out.println("" + node.value);
            displayPreorder(node.left);
            displayPreorder(node.right);
        }
    }

    public static void displayPostorder(Node node) {
        if (node != null) {
            displayPostorder(node.left);
            displayPostorder(node.right);
            System.out.println("" + node.value);
        }
    }
}