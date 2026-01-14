import java.util.Stack;



class Node {
    Node left, right;
    int data;

    Node(int key) {
        data = key;
        left = null;
        right = null;
    }
}

public class pathSum {
    static boolean hasPathSum(Node root, int targetSum) {
        if (root == null) return false;

        Stack<Node> stk = new Stack<>(); 
        Stack<Integer> sums = new Stack<>(); 
        stk.push(root);
        sums.push(root.data);

        while (!stk.isEmpty()) {
            Node node = stk.pop();
            int sum = sums.pop();

            // Check if leaf node and sum matches
            if (node.left == null && node.right == null 
                && sum == targetSum)
                return true;

            // Add children to stacks with updated sums
            if (node.left != null) {
                stk.push(node.left);
                sums.push(sum + node.left.data);
            }
            if (node.right != null) {
                stk.push(node.right);
                sums.push(sum + node.right.data);
            }
        }

        return false;
    }

    public static void main(String[] args) {
      
         
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        int targetSum = 21;
        System.out.println(hasPathSum(root, targetSum));
    }
}
