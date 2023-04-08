public class SubTree {

    static boolean areIdentical(NodeSubtree root1, NodeSubtree root2)
    {

        /* base cases */
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        /* Check if the data of both roots is same and data of left and right
           subtrees are also same */
        return (root1.val == root2.val
                && areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right));
    }
    static boolean isSubtree(NodeSubtree T, NodeSubtree S)
    {
        /* base cases */
        if (S == null)
            return true;

        if (T == null)
            return false;

        /* Check the tree with root as current node */
        if (areIdentical(T, S))
            return true;

        /* If the tree with root as current node doesn't match then
           try left and right subtrees one by one */
        return isSubtree(T.left, S)
                || isSubtree(T.right, S);
    }

    public static void main(String[] args)
    {
       // SubTree subTree  = new SubTree();
        NodeSubtree root, subtree;
        root= new NodeSubtree(26);
     root.right= new NodeSubtree(3);
//      root.right.right=new NodeSubtree(3);
        root.left= new NodeSubtree(10);
//        root.left.left=new NodeSubtree(4);
//        root.left.right= new NodeSubtree(6);
//        root.left.left.right= new NodeSubtree(30);


        //tree 2
//        subtree= new NodeSubtree(10);
//        subtree.right = new NodeSubtree(6);
//        subtree.left = new NodeSubtree(4);
//        subtree.left.right = new NodeSubtree(30);

        subtree= new NodeSubtree(26);
        subtree.left = new NodeSubtree(10);
        subtree.right= new NodeSubtree(3);
//        subtree.left = new NodeSubtree(4);
//        subtree.left.right = new NodeSubtree(30);

        if (isSubtree(root, subtree))
            System.out.println("Tree 2 is subtree of Tree 1 ");
        else
            System.out.println("Tree 2 is not a subtree of Tree 1");
    }
}

 class NodeSubtree {

     int val;
     NodeSubtree left;
     NodeSubtree right;
     NodeSubtree ( int val)
    {
        this.val=val;
        left=right=null;
    }
}
