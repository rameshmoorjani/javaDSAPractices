import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class ArrayStack {

    public static void main(String[] args) {
        int[] target= {1,2};
        int n=2;

        List<String> stackOperation = new ArrayList<>();
        int index=1;
        for(int i:target)
        {
            while(index<i)
            {
                stackOperation.add("push");
                stackOperation.add("pop");
                index++;
            }
            stackOperation.add("push");
            index++;
        }

        System.out.println("stack operation "+stackOperation);
    }
}
