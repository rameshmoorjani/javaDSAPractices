import java.util.Vector;

public class MatchingBracesCombinations {

    public static void main(String[] args) {
        String output="";
        int open=3;
        int close=3;
        Vector<String> vector = new Vector<String>();

        Vector<String> op1 =solve(open,close,output,vector);

        System.out.println("output is "+op1);

    }

    public static Vector<String> solve(int open, int close, String output, Vector<String> vector)
    {
        if(open==0 && close==0)
        {
            vector.add(output);
            return vector;
        }

        if(open!=0)
        {
            String op1=output;
            op1=op1.concat("(");
            solve(open-1,close,op1,vector);
        }

        if(close>open)
        {
            String op1=output;
            op1=op1.concat(")");
            solve(open,close-1,op1,vector);
        }

        return vector;

    }
}
