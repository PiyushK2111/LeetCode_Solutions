class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int mid=nums.length/2;
        long res=0;
        for(int i=0;i<mid;i++){
            res-=nums[i];
        }
        for(int i=mid;i<nums.length;i++){
            res+=nums[i];
        }
        return res;
    }
}