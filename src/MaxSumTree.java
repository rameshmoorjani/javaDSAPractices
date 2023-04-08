    // Java program to find maximum path sum in Binary Tree

    /* Class containing left and right child of current
     node and key value*/
    class NodeTree {

        int data;
        NodeTree left, right;

        public NodeTree(int item)
        {
            data = item;
            left = right = null;
        }
    }

    // An object of Res is passed around so that the
// same value can be used by multiple recursive calls.
    class Res {
        public int val;
    }

    class MaxSumTree {

        // Root of the Binary Tree
        NodeTree root;

        // This function returns overall maximum path sum in
        // 'res' And returns max path sum going through root.
        int findMaxUtil(NodeTree node, Res res)
        {

            // Base Case
            if (node == null)
                return 0;

            // l and r store maximum path sum going through left
            // and right child of root respectively
            int l = findMaxUtil(node.left, res);
            int r = findMaxUtil(node.right, res);

           // if(node.left!=null && node.right!=null) {
                //int ans = Math.max(res.val, l + r + node.data);

                int temp = Math.max(l, r) + node.data;

                int ans = Math.max( res.val,l + r + node.data);

                // int ans =Math.max(temp,l+r+node.data);
                res.val = ans;
                return temp;
            //}
            //return (node.left==null)?r+node.data:l+ node.data;
            //max using leaf nodes
            /*if(node.left!=null && node.right!=null) {
                //int ans = Math.max(res.val, l + r + node.data);

                int temp = Math.max(l, r) + node.data;

                int ans = Math.max( res.val,l + r + node.data);

                // int ans =Math.max(temp,l+r+node.data);
                res.val = ans;
                return temp;
            }
            return (node.left==null)?r+node.data:l+ node.data;*/



        }

        int findMaxSum() { return findMaxSum(root); }

        // Returns maximum path sum in tree with given root
        int findMaxSum(NodeTree node)
        {

            // Initialize result
            // int res2 = Integer.MIN_VALUE;
            Res res = new Res();
            res.val = Integer.MIN_VALUE;

            // Compute and return result
            findMaxUtil(node, res);
            return res.val;
        }

        /*
                        10
                      /    \
                    2        10
                  /   \        \
                20     1        -25
                                /  \
                               3    4
        */
        /* Driver code */
        public static void main(String args[])
        {
            MaxSumTree tree = new MaxSumTree();
            tree.root = new NodeTree(10);
            tree.root.left = new NodeTree(2);
            tree.root.right = new NodeTree(10);
            tree.root.left.left = new NodeTree(20);
            tree.root.left.right = new NodeTree(1);
            tree.root.right.right = new NodeTree(-25);
            tree.root.right.right.left = new NodeTree(3);
            tree.root.right.right.right = new NodeTree(4);

            /*tree.root.left = new NodeTree(9);
            tree.root.right = new NodeTree(20);
            tree.root.right.right = new NodeTree(7);
            tree.root.right.right.left = new NodeTree(15);*/

            // Function call
            System.out.println("maximum path sum is : "
                    + tree.findMaxSum());
        }
    }
