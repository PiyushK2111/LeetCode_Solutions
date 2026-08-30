class Solution {
    public int findPeakElement(int[] nums) {
        int idx=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                idx=i;
            }
        }
        return idx;
    }
}