public class RotationCharArray {



    void rotationalCipher(String input, int rotationFactor) {
        // Write your code here
        //return "";

        char[] chars=input.toCharArray();
        for(int i=0; i<chars.length;i++)
        {
            rotate(i, chars, rotationFactor);
        }

    }

    void rotate(int i, char[] chars, int rf )
    {
        char c =chars[i];
        char nextChar;
        if(c >='a' && c<='z')
        {
            nextChar=(char) ((c -'a'+rf)%26 +'a');
        }
    }

}
