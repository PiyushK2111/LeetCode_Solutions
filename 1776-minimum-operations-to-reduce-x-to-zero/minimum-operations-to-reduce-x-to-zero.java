class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int tar=sum-x;
        if(tar<0){
            return-1;
        }
        if(tar==0){
            return nums.length;
        }
        int left=0;
        int currSum=0;
        int maxLen=-1;
        for(int right=0;right<nums.length;right++){
            currSum+=nums[right];
            while(currSum>tar){
                currSum-=nums[left++];
            }
            if(currSum==tar){
                maxLen=Math.max(maxLen,right-left+1);
            }
        }
        return maxLen==-1? -1:nums.length-maxLen;
    }
}