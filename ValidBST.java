import java.util.Scanner;

public class ValidBST {
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

            boolean validator = isValidBST(BinaryTreePractise.root, null, null);
            System.out.println("The given tree is a valid BST? " + validator );
        }
    }
    
    public static boolean isValidBST (Node root, Integer lower, Integer upper) {
        if (root == null) {
            return true;
        }
        if ((lower != null && root.value <= lower) || (upper != null && root.value >= upper)) {
            return  false;
        }
         return isValidBST(root.left, lower, root.value) && isValidBST(root.right, root.value, upper);
    } 
}
