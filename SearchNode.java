import java.util.Scanner;

public class SearchNode {
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

            System.out.println("Enter the element you want to search: ");
            int element = scanner.nextInt();

            boolean searcher = searchElement(BinaryTreePractise.root, element);
            System.out.println("Is the element present?: " + searcher);
        }
    }

    public static boolean searchElement(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.value == data) {
            return true;
        } return data < root.value ? searchElement(root.left, data) : searchElement(root.right, data);
    }
}
