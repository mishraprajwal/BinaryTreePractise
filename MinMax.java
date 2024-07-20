import java.util.Scanner;

public class MinMax {
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

            int min = findMin(BinaryTreePractise.root);
            System.out.println("The minimum element in the tree is:" + min);

            int max = findMax(BinaryTreePractise.root);
            System.out.println("The maximum element in the tree is:" + max);
        }


    } 
    
    public static int findMin(Node root) {
        while (root.left != null) {
        root = root.left;
        }
    return root.value;
    }

    public static int findMax(Node root) {
        while (root.right != null) {
        root = root.right;
        }
        return root.value;
    }

}
