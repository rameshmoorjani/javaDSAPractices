import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombinations {

   public void lettersCombinationRecursive(List<String> result,String digits,String current,int index,String[] mapping)
    {
        if(index==digits.length())
        {
            result.add(current);
            return;
        }
        String letters= mapping[digits.charAt(index) -'0'];
        for (int i = 0; i < letters.length(); i++) {
            //System.out.print(list.get(i) + " ");
            lettersCombinationRecursive(result,digits,current+letters.charAt(i),index+1,mapping);
        }

    }



    public static void main(String[] args)
    {
        List<String> result = new ArrayList<String>();
        String digits="23";
        /*if(digits==null || digits.length()==0)
        {
            return digits;
        }*/

        String[] mapping={ "0",   "1",   "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz" };













        new PhoneNumberCombinations().lettersCombinationRecursive(result,digits,"",0,mapping);

        System.out.println("result is "+result);

    }

}
