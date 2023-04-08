import java.util.ArrayList;
import java.util.Stack;

public class NextMaximumNumber {

    NextMaximumNumber()
    {
        super();
    }

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack();
        int[] array = new int[] {1,3,2,4};
        int size = array.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = size-1 ;i>=0; i--)
        {
            if(stack.isEmpty())
            {
                stack.push(array[i]);
                list.add(-1);
            }
            else if(stack.size()>0 && array[i]<stack.peek())
            {
                list.add(stack.peek());
            }
            else if(stack.size()>0 && array[i]>= stack.peek())
            {
                while (stack.size()>0 && stack.peek()<=array[i])
                {
                    stack.pop();
                }
                if(array[i]<stack.peek())
                {
                    list.add(array[i]);
                }
                else
                {
                    list.add(stack.peek());
                }
            }
             stack.push(array[i]);
        }

        System.out.println(" next max number is "+list);


    }


}
