import java.util.Scanner;

public class FindHeight {
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

            int height = findHeight(BinaryTreePractise.root);
            System.out.println("The height of tree is " + height);
        }
    }

    public static int findHeight (Node root) {
        if (root == null) {
            return -1;
        } 
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        if (leftHeight > rightHeight) {
            return 1 + leftHeight;
        } else {
            return 1 + rightHeight;
        }
    } 
}
