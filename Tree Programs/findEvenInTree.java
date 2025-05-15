public class findEvenInTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    static int count = 0;

    public static int countEvenNodes(Node root) {
        if (root == null) {
            return count;
        }
        if (root.data % 2 == 0) {
            count++;
        }
        countEvenNodes(root.left);
        countEvenNodes(root.right);
        return count;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(6);
        root.right = new Node(8);
        root.left.left = new Node(9);
        root.left.right = new Node(12);
        root.right.left = new Node(13);
        root.right.right = new Node(15);
        int totalEvenNode = countEvenNodes(root);
        System.out.println(totalEvenNode);
    }
}
