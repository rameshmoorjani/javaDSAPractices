public class RecursiveLinearSearch {

    public static void main(String[] arg)
    {
        int abc[] = new int[] {2,6,9,10};

        System.out.println("index is "+searchLinearArray(abc,9,0,abc.length-1));
    }

    public static int searchLinearArray( int[] arry,int x,int ind,int lastIndex)
    {
       if(arry[ind]==x)
       {
           return ind;
       }
       if(arry[lastIndex]==x)
       {
           return  lastIndex;
       }
       System.out.println("ind::"+ind+"::lastIndex::"+lastIndex);
       int midPoint= ind+lastIndex/2;
       System.out.println("mid point "+midPoint);
       if(arry[midPoint]>x) {
           System.out.println("in if ");
           return searchLinearArray(arry, x, ind , midPoint);
       }
       else
       {
           System.out.println("in else");
           return searchLinearArray(arry, x, midPoint ,lastIndex);
       }
    }
}
