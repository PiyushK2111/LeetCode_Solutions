class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        long maxSum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return(double)maxSum/k;
    }
}