
public class createTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        printTree(root);
    }
}
