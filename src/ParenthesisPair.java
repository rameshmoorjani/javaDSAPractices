import java.util.ArrayList;
import java.util.List;

public class ParenthesisPair {
    static ArrayList<StringBuilder> list =new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(parenthesisPair(3,new StringBuilder()));
    }

public static ArrayList<StringBuilder> parenthesisPair(int n,StringBuilder s)
{
    if(n==1) {
        ArrayList list1 = new ArrayList();
        s.append("(").append(")");
        list1.add(s);

        list=list1;
        return list1;
    }
    else {
        parenthesisPair(n-1,s);
        parenthesisPair(n-1,s);

        return list;
    }




}

}