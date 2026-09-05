class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int idx=0;         // index we're currently testing as the answer
        int max=Integer.MIN_VALUE;        // biggest number seen anywhere so far
        int ansMax=Integer.MIN_VALUE; // biggest number up to ansIdx

        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);

            // only update the candidate's max while we're still inside its prefix
            if(i==idx)
                ansMax=Math.max(ansMax,nums[i]);

            // this number is below the allowed floor, jump past it
            if(nums[i]<ansMax-k){
                idx=i+1;
                ansMax=max;
            }
        }
        return idx<n?idx:-1;
    }
}