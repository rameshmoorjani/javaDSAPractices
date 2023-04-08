public class RemoveDupilcate {

    public static void main(String[] args )
    {
        int[] nums= new int[]{1,1,2,3,3};
        System.out.println("index is "+removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums)
    {

        int index=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[index++]=nums[i+1];
                System.out.println("nums elemenet is "+nums[i]);
            }
        }
        int j=index;
        System.out.println("arry is "+nums);
        for(int k=0;k<j;k++)
        {
            System.out.println("element is "+nums[k]);
        }
        return index;

    }
}
