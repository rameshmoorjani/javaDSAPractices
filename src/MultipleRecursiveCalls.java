import java.sql.SQLOutput;

public class MultipleRecursiveCalls {

    public static void main(String[] args) {

        System.out.println();
        boolean x=recursivecalls(5);
    }

    static boolean recursivecalls(int val)
    {
        if( val>2)
        {
            boolean x=recursivecalls(val-1) && recursivecalls(val-2) && recursivecalls(val-3);
        }

        System.out.println("val is "+val);
        return false;
    }
}
