import java.math.BigDecimal;
import java.util.Date;

class StringPerformance {

    public static void main(String[] args) {


        String str="k";
        String s="ramesh";
        Date start = new Date();
        try {
            for (int i = 0; i < 100000; i++) {
                s=s+str;

            }
            Date end = new Date();

            System.out.println("total time " + String.valueOf(end.getTime() - start.getTime()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        StringBuilder strBuilder=new StringBuilder("k");
        StringBuilder sBuilder= new StringBuilder("ramesh");
        Date start1 = new Date();
        try {
            for (int i = 0; i < 100000; i++) {
                sBuilder=sBuilder.append(strBuilder);

            }
            Date end1 = new Date();

            System.out.println("total time stringBuilder " + String.valueOf(end1.getTime() - start1.getTime()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        double f =1.59;
        double f1 =2.59;
        System.out.println(f1-f);

        BigDecimal bd =new BigDecimal("1.59");
        BigDecimal bd1 =new BigDecimal("2.59");
        System.out.println(bd1.subtract(bd));
    }
}
