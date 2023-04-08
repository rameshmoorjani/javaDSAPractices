public class SetCombinations {

    public static void main(String[] args) {
        String input="ab";
        String output="";
        solve(input,output);
    }

    public static void solve(String input, String output)
    {
        if(input.length()==0)
        {
            System.out.println(output);
            return ;
        }

        String input1= input.substring(1);
        Character char1=input.charAt(0);
        String op1=output;
        String op2 = output+char1;
        solve(input1,op1);
        solve(input1,op2);
       // return;
    }
}
