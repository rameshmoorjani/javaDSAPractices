import java.util.Arrays;

public class ElementShifting {

    public static void main (String[] args)
    {
        System.out.println();
        int[] nums = new int[]{0,1,0,2,3};
        int index=0;
        for(int i=0; i< nums.length;i++)
        {

//            if(nums[positionZero]==0&&nums[i+1]!=0)
//            {
//                positionZero++;
//                int temp=nums[positionZero];
//                nums[positionZero]=nums[i];
//                nums[i]=temp;
//
//            }
            if(nums[i]!=0)
            {
                nums[index++]= nums[i];
            }
        }
        for(int i=index; i< nums.length;i++)
        {
            nums[i]=0;

        }

        for(int i=0; i< nums.length;i++)
        {
            System.out.println("array iss "+ nums[i]);
        }

    }
}
