public class MyThreadTest {



    public static void main(String[] args) throws InterruptedException {


        for(int count=0;count<5;count++)
        {
            MyRunnable myRunnable = new MyRunnable(count);
            Thread t1 = new Thread(myRunnable);
            //Thread t2 = new Thread(myRunnable);
            t1.start();

           // t1.join();
          //  t2.start();
        }
    }


}


class MyRunnable implements  Runnable{
    int count;
    MyRunnable(int count)
    {
        this.count=count;
    }


    @Override
    public void run() {
        System.out.println("hello "+count);
    }
}