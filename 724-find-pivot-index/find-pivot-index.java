class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int ele:nums){
            total+=ele;
        }
        int prefix=0;
        for(int pivot=0;pivot<nums.length;pivot++){
            int suffix=total-prefix-nums[pivot];
            if(suffix==prefix){
                return pivot;
            }
            prefix+=nums[pivot];
        }
        return -1;
    }
}