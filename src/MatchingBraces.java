import java.util.HashSet;
import java.util.Stack;

public class MatchingBraces {

        public static boolean isValid(String s) {
            boolean isValid=false;
            Stack<Character> chars = new Stack<Character>();

            for(char c: s.toCharArray())
            {
                if(c =='('|| c=='['||c=='{')
                {
                    //setBracesC.add(c);
                    chars.push(c);
                }
                else
                {
                    if(c==')' && chars.peek()=='(')
                    {
                        chars.pop();
                    }
                    else if(c == '}' && chars.peek() == '{')
                        chars.pop();
                    else if(c == ']' && chars.peek() == '[')
                        chars.pop();
                    else
                        return false;
                }
            }
            if(chars.size()==0)
            {
                isValid=true;
            }
            return isValid;
        }

    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
}
