class Solution {
    public static int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) nums[i]=0;
            else nums[i]=1;
        }
        int [] arr=new int[n+1];
        arr[0]=1;
        int sum=0;
        int ans=0;
        for(int num:nums){
            sum+=num;
            if(sum>=k)  {
                ans+=arr[sum-k];
                sum=sum-nums[sum-k];
            }
            arr[sum]++;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1},3));

    }
}