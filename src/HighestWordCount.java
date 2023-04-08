import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class HighestWordCount {

    public static void main(String[] args)
    {
        String paragraph="Hello How are you Hope you Are good,how, hope , hope ";
        String[] bannedwords={"you"};

        String word=wordCount(paragraph,bannedwords);

        System.out.println("highest used word is "+word);
    }

    public static String wordCount(String paragraph,String[] bannedwords)
    {
        HashSet<String> bannedwordSet = new HashSet<String>();
        for(String word:bannedwords)
        {
            bannedwordSet.add(word);
        }
        HashMap<String,Integer> counts = new HashMap<String,Integer>();
        for(String word1:paragraph.replaceAll("^a-zA-Z"," ").toLowerCase(Locale.ROOT).split(" "))
        {
            if(!bannedwordSet.contains(word1))
            counts.put(word1,counts.getOrDefault(word1,0)+1);
        }

paragraph.replaceAll("^a-zA-Z","").toLowerCase(Locale.ROOT).split(" ");
        System.out.println("counts::"+counts);

        String result ="";

        for(String key:counts.keySet())
        {
            if(result.equals("")||counts.get(key)>counts.get(result))
            {
                result=key;
            }
        }
        return result;
    }

}
