import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionHandlingTest {
   // static InputStream inputStream;
    public static void main(String[] args)
    {
        for(int i=0;i<50000;i++) {
            try {
                InputStream inputStream = new FileInputStream(new File("/Users/ramesh/Downloads/Resume.doc"));
                inputStream.read();
                 String abc=null;
                 abc.equals("");
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }

    }
}
