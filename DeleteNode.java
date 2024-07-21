import java.util.Scanner;

public class DeleteNode {
    public static void main(String[] args) {
        BinaryTreePractise tree = new BinaryTreePractise();
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of nodes in the binary tree:");
            int numberOfNodes = scanner.nextInt();
            System.out.println("Enter the elements of the nodes:");
            for (int i = 0; i < numberOfNodes; i++) {
                tree.insert(scanner.nextInt());
            }
            System.out.println("Inorder traversal for binary tree:");
            tree.displayInorder(BinaryTreePractise.root);

            System.out.println("Enter the element you want to delete:");
            int element = scanner.nextInt();

            deleteNode(BinaryTreePractise.root, element);
            System.out.println("Inorder traversal for binary tree:");
            tree.displayInorder(BinaryTreePractise.root);


        }
    }

    public static Node deleteNode (Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.value) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.value) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.value = MinMax.findMin(root.right);
            root.right = deleteNode(root.right, root.value);
        }
        return root;
    }
}
