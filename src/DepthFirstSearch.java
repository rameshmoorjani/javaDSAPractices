import java.util.*;

public class DepthFirstSearch {
    List tree = new ArrayList();
    static int max=0;
    public static void main(String[] args) {
        Node1 nodeD = new Node1("D", null, null);
        Node1 nodeE = new Node1("E", null, null);
        Node1 nodeF = new Node1("F", null, null);
        Node1 nodeB = new Node1("B", nodeD, nodeE);
        Node1 nodeC = new Node1("C", null, nodeF);
        Node1 root = new Node1("A", nodeB, nodeC);
       // Node1 root = new Node1("A", null, null);
        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();

        solve(root,list);

        System.out.println("list "+list);

        // all paths of tree

        List<String> paths = new ArrayList<>();
        allPathsDfs(root,"",paths);

        System.out.println("all paths of tree "+paths);


       /* result=zigzag(root,result);
        System.out.println("result is "+result);
        //System.out.println(" lcp is "+lcp(root,result));

        //Node5 node5 = new Node5(5,null,null);
        //Node5 node4 = new Node5(4,null,node5);
        Node5 node3 = new Node5(3,null,null);
        Node5 node2 = new Node5(2,null,null);
        Node5 node1 = new Node5(1,node2,node3);
        int max=0;
        max=lcp(node1,1);
        System.out.println(" lcp is "+max);*/


        /**
         *
         *         A
         *       /  \
         *      B    C
         *    /  \   / \
         *   D    E     F
         *
         */
       /* HashMap<String,LinkedList<String>> graph = new HashMap<>();
       // createGraph(root,graph);
        System.out.println(" graph isss "+graph);*/
        /*DepthFirstSearch.executeDFS(root);

        System.out.println("tree is "+DepthFirstSearch.executeDFSRecursive(root,new ArrayList()));*/

      //  System.out.println("count is "+getWidthRight(root,0));
    }
 
    public static void executeDFS(Node1 root) {
        Stack nodeStack = new Stack();
        Node1 currentNode = root;
        System.out.println("==================== DFS traversal =====================");
        nodeStack.push(currentNode);
        while(!nodeStack.isEmpty()) {
            currentNode = (Node1) nodeStack.pop();
            System.out.println("-- " + currentNode.getData() + "--");
 
            if(currentNode.getLeft() == null && currentNode.getRight() == null) {
                continue;
            }
            else {
                if(currentNode.getRight() != null) {
                    nodeStack.push(currentNode.getRight());
                }
                if(currentNode.getLeft() != null) {
                    nodeStack.push(currentNode.getLeft());
                }
            }
        }
    }

    public static ArrayList<Node1> executeDFSRecursive(Node1 root,ArrayList list) {
        if(root==null)
        {
            return null;
        }

        list.add(root.data);
        executeDFSRecursive(root.left,list);
        executeDFSRecursive(root.right,list);


        return list;

    }

    public static int getWidthLeft(Node1 root,int count) {
        if(root==null)
        {
            return count;
        }

        count++;
        return getWidthLeft(root.left,count);

        //return count;

    }

    /*public static int getWidthRight(Node1 root,int count) {
        if(root==null)
        {
            return count;
        }
        System.out.println("right val "+root.getData());
        count++;
        return getWidthRight(root.right,count);

        //return count;

    }*/

    public static Node1 createGraph(Node1 root, HashMap<String, LinkedList<String>> graph) {
        if(root == null) {
            return null;
        }
        Node1 left = createGraph(root.left, graph);
        Node1 right = createGraph(root.right, graph);

        LinkedList<String> temp =new LinkedList<String>();
        if(left!=null)
        {
           // temp.add(left.getData());
            temp =graph.getOrDefault(root.getData(),new LinkedList<String>());
            temp.add(left.getData());
            graph.put(root.data, temp);
            temp= graph.getOrDefault(left.data,new LinkedList<>());
            temp.add(root.data);
            graph.put(left.data,temp );

        }
        if(right!=null)
        {
            // temp.add(left.getData());
            temp =graph.getOrDefault(root.getData(),new LinkedList<String>());
            temp.add(right.getData());
            graph.put(root.data, temp);
            temp= graph.getOrDefault(right.data,new LinkedList<>());
            temp.add(root.data);
            graph.put(right.data,temp );

        }

        return root;
    }

    public static int lcp(Node5 root,int count)
    {
        max=Math.max(max,count);
        if(root==null || (root.left==null && root.right==null))
        {
            return count;
        }



        if(root.left!=null)
        {
            lcp(root.left,root.getData()+1==root.left.getData()?count+1:1);
        }
        if(root.right!=null)
        {
            lcp(root.right,root.getData()+1==root.right.getData()?count+1:1);

        }

        return max;


    }

    public static ArrayList zigzag(Node1 root,ArrayList<String> list)
    {
        if(root==null)
        {
            return list ;
        }

        Queue<String> queue = new LinkedList<>();

        queue.add(root.getData());

        boolean lefToRight=true;

        while (!queue.isEmpty())
        {
            list.add(queue.poll());
            if(lefToRight) {
                queue.add(root.left.getData());
                queue.add(root.right.getData());
                
            }
            else {
                queue.add(root.right.getData());
                queue.add(root.left.getData());
            }
        }

        return  list;
    }

    public static void solve(Node1 root,ArrayList list ){
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<String> res = new ArrayList<>();

            for(int i = 0 ; i < size ; i++){
                Node1 cur = q.remove();
                res.add(cur.getData());
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
            }

            if(level % 2 != 0){
                for(int i = res.size() - 1 ; i >= 0 ; i--){
                    list.add(res.get(i));
                }
            }
            else{
                for(String x : res)
                    list.add(x);
            }
            level++;
        }
    }

    public static void allPathsDfs(Node1 root,String path, List<String> paths)
    {
        path+=root.data;

        if(root.left==null && root.right==null)
        {
            paths.add(path);
            return;
        }

        if(root.left!=null) {
            allPathsDfs(root.left, path, paths);
        }
        if(root.right!=null) {
            allPathsDfs(root.right, path, paths);
        }
    }
}
 
class Node1 {
    String data;
    Node1 left;
    Node1 right;

    public Node1(String data, Node1 left, Node1 right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public String getData() {
        return this.data;
    }

    public Node1 getLeft() {
        return this.left;
    }

    public Node1 getRight() {
        return this.right;
    }
}

class Node5 {
    int data;
    Node5 left;
    Node5 right;

    public Node5(int data, Node5 left, Node5 right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return this.data;
    }

    public Node5 getLeft() {
        return this.left;
    }

    public Node5 getRight() {
        return this.right;
    }
}

//////////////////////


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*
class Solution {


    public int amountOfTime(TreeNode root, int start) {
        //create a graph out of binary tree and do a bfs on the same
        HashMap<Integer, LinkedList<Integer>> graph = new HashMap();
        createGraph(root, graph);
        Queue<Integer> q = new LinkedList();
        q.add(start);
        int depth = 0;
        HashMap<Integer, Integer> visited = new HashMap();
        visited.put(start, 0);
        while(!q.isEmpty()) {
            Integer cur = q.remove();
            List<Integer> neighbors = graph.getOrDefault(cur, new LinkedList());
            for(int x: neighbors) {
                if(visited.get(x) == null) {
                    visited.put(x, visited.get(cur)+1);
                    depth = Math.max(depth, visited.get(cur)+1);
                    q.add(x);
                }
            }
        }
        return depth;
    }

    public TreeNode createGraph(TreeNode root, HashMap<Integer, LinkedList<Integer>> graph) {
        if(root == null) {
            return null;
        }
        TreeNode left = createGraph(root.left, graph);
        TreeNode right = createGraph(root.right, graph);

        LinkedList<Integer> temp = null;
        if(left != null) {
            temp = graph.getOrDefault(root.val, new LinkedList());
            temp.add(left.val);
            graph.put(root.val, temp);
            temp = graph.getOrDefault(left.val, new LinkedList());
            temp.add(root.val);
            graph.put(left.val, temp);
        }
        if(right != null) {
            temp = graph.getOrDefault(root.val, new LinkedList());
            temp.add(right.val);
            graph.put(root.val, temp);
            temp = graph.getOrDefault(right.val, new LinkedList());
            temp.add(root.val);
            graph.put(right.val, temp);
        }

        return root;
    }
}*/
