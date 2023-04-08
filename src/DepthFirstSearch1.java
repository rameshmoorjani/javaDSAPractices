import java.util.Stack;
public class DepthFirstSearch1 {

    public static void depthFirstSearch(Node2 root) {
        Stack stack = new Stack();
        Node2 currentNode = root;
        System.out.println("==================== DFS traversal =====================");
        stack.push(currentNode);
        while (!stack.isEmpty()) {
            Node2 node = (Node2) stack.pop();
            System.out.println("current Node " + node.val);
            if (node.left == null && node.right == null) {
                continue;
            } else {
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
    }
    public static int treeHeight(Node2 root, int height) {
        if (root == null) return 0;
        int leftsubtreeheight = treeHeight(root.left, height) + 1;
        int rightsubtreeheight = treeHeight(root.right, height) + 1;
        if (leftsubtreeheight > rightsubtreeheight) {
            height = leftsubtreeheight;
        } else {
            height = rightsubtreeheight;
        }
        return height;
    }
    public static int treeMaxValue(Node3 root) {
        if (root == null) return 0;
        int nodeValue = root.val;
        /*if(nodeValue>maxValue)
        {
            maxValue=nodeValue;
        }*/
        int lres = treeMaxValue(root.left);
        int rres = treeMaxValue(root.right);
        if (lres > nodeValue) {
            nodeValue = lres;
        }
        if (rres > nodeValue) {
            nodeValue = rres;
        }
        return nodeValue;
    }
    public static void main(String[] args) {
        /*Node2 f =  new Node2("F",null,null);
        Node2 g =  new Node2("G",null,null);
        Node2 e =  new Node2("E",null,null);
        Node2 d =  new Node2("D",null,null);
        Node2 b =  new Node2("B",d,e);
        Node2 c =  new Node2("C",f,e);
        Node2 a  = new Node2("A",b,c);*/
        Node2 root = new Node2("A");
        root.left = new Node2("B");
        root.right = new Node2("C");
        root.left.left = new Node2("D");
        root.right.left = new Node2("E");
        root.right.left.left = new Node2("F");
        depthFirstSearch(root);
        System.out.println("tree height is " + treeHeight(root, 0));
        Node3 root1 = new Node3(1);
        root1.left = new Node3(2);
        int maxValue = Integer.MIN_VALUE;
        System.out.println("max value is " + treeMaxValue(root1));

    }
}
class Node2 {
    String val;
    Node2 left;
    Node2 right;
    Node2(String val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class Node3 {
    int val;
    Node3 left;
    Node3 right;
    Node3(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}