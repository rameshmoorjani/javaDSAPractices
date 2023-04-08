import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public static void main(String[] args) {

        int[] arr = {1,2};
        int[] subsequence=null;
        List<ArrayList<Integer>> fullPath = new ArrayList<ArrayList<Integer>>();
        subSequence(arr,0,new ArrayList<Integer>() ,fullPath);
        System.out.println("full path is "+fullPath);

    }

    static ArrayList<Integer>  subSequence(int[] array, int index, ArrayList<Integer> path, List<ArrayList<Integer>> fullPath)
    {

        if(index==array.length) {
            System.out.println("path is " + path);
            fullPath.add(new ArrayList<>(path));
            return path;
        }
        subSequence(array,index+1,path,fullPath);
        path.add(array[index]);
        subSequence(array,index+1,path,fullPath);
        path.remove(path.size()-1);
        return path;

    }
}
