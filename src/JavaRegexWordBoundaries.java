import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexWordBoundaries {

    public static void main(String[] args) {

        /*var text = " This is a fortune\n" +
                "%\n" +
                "Here is\n" +
                "Another fortune\n" +
                "%\n" +
                "What does the fox say?\n" +
                "%\n" +
                "The\n" +
                "Cow%\n" +
                "Says %\n" +
                "Moo";

        */

        try {
            //String FILE_PATH = "/Users/ramesh/fortune.txt";
            List<String> allMatches = new ArrayList<>();
            //Scanner input = new Scanner(new File(FILE_PATH), StandardCharsets.UTF_8);
            FileInputStream fis = new FileInputStream( "/Users/ramesh/fortune.txt" );
            BufferedReader br = new BufferedReader( new InputStreamReader( fis ) );

            String s="";
            StringBuffer sb=new StringBuffer();
            while ((s=br.readLine())!=null){
                if(s.contains("%"))
                {
                    String temp="";
                    if(s.indexOf("%")>0)
                    {
                        temp=s.substring(0,s.indexOf("%"));
                    }
                    allMatches.add(sb.toString()+temp);
                    sb=new StringBuffer();
                }
                else
                {
                    sb.append(s);
                   // allMatches.add(sb.toString());
                }
                /*String temp = input.next();
                //Matcher m = Pattern.compile("\"(.*)\"").matcher(temp);
                Matcher m = Pattern.compile("%").matcher(temp);
                while (m.find()) {
                    allMatches.add(m.group(1));
                }*/
            }
            if(!sb.toString().isEmpty())
            {
                allMatches.add(sb.toString());
            }
            allMatches.forEach(System.out::println);

            int max = allMatches.size();
            Random rand = new Random();
            System.out.println("random element is "+allMatches.get(rand.nextInt(max)));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

}