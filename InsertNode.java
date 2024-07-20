import java.util.Scanner;

public class InsertNode {
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

            System.out.println("Enter the element you want to insert: ");
            int element = scanner.nextInt();
            insertElement(BinaryTreePractise.root, element);

            System.out.println("Inorder traversal for the new binary tree is:");
            tree.displayInorder(BinaryTreePractise.root);
        }
    } 
    
    public static Node insertElement(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.value) {
            root.left = insertElement(root.left, data);
        } else if (data > root.value) {
            root.right = insertElement(root.right, data);
        }
        return root;
    }
}
