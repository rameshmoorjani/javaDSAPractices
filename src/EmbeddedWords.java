import java.util.*;

public class EmbeddedWords {

    public static void main(String[] args) {

        String[] words ={"cat","baby","tac"};
        String emeddedStr = "tactc";
        embeddedWords(words,emeddedStr);
    }

    private static String embeddedWords(String[] words,String str)
    {
        String embeddedWords="";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:str.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);

        }
        System.out.println(map);

        List<String> embeddedList = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(char s:words[i].toCharArray())
            {
                if(map.containsKey(s))
                {
                    map.put(s,map.getOrDefault(s,0)-1);
                    embeddedWords=embeddedWords.concat(String.valueOf(s));
                    if(embeddedWords.length()==words[i].length())
                    {
                        embeddedList.add(embeddedWords);
                        break;
                    }

                }
                else
                {
                    embeddedWords="";
                    break;
                }
            }
        }
        System.out.println("embeddedList "+embeddedList);
        System.out.println("embeddedwords "+embeddedWords);

        return embeddedWords;

    }
}
