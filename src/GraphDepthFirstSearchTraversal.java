import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDepthFirstSearchTraversal {


    public static void main(String[] args) {

        //https://www.javatpoint.com/depth-first-search-algorithm


        Graph graph = new Graph(8);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);

        System.out.println("Depth First Traversal for the graph is:");

    //    graph.DFS( 0);


        graph.BFS(0);
    }


}

class Graph {

    LinkedList<Integer>[] arr;
    boolean[] visited;

    Graph(int V) {
        arr = new LinkedList[V];
        visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            arr[i] = new LinkedList<Integer>();
        }

    }

    void insertEdge(int i, int j) {
        arr[i].add(j);
    }

    void DFS(int i )
    {
        visited[i]=true;
        System.out.println(" "+i);
        Iterator<Integer> it = arr[i].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DFS(n);
        }
    }

    void BFS(int i )
    {
        visited[i]=true;
       // System.out.println(" element "+i);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);

        while(queue.size()>0)
        {
            int val = queue.remove();
            System.out.println(" element "+val);

            for(int j=0; j< arr[val].size();j++)
            {
                int a =arr[val].get(j);
                if(!visited[a]) {
                    visited[a]=true;
                    queue.add(a);
                }
            }
        }
        /*Iterator<Integer> it = arr[i].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                DFS(n);
        }*/
    }
}
