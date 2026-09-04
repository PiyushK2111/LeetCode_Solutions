class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int idx = -1;
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(nums[j],max);
            }
            for(int z=i;z<nums.length;z++){
                min=Math.min(nums[z],min);
            }
            if(max-min<=k){
                idx = i;
                break;
            }
        }
        return idx;
    }
}