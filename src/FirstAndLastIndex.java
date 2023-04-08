public class FirstAndLastIndex {
    public static void main(String[] args)
    {
        int[] nums= new int[]{1,2,3,4,5,6,7,4};
        int target = 4;
        int startIndex=0;
        int endIndex=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                count++;
                if(count==1) {
                    startIndex = i;
                }
                endIndex=i;
            }
        }

        System.out.println("first index "+startIndex+" last Index "+endIndex);

    }
}
