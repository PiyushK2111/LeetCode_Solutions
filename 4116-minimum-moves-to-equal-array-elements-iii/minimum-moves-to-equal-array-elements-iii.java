class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int x:nums){
            if(x>max){
                max=x;
            }
        }
        int ans=0;
        for(int x:nums){
            ans+=max-x;
        }
        return ans;
    }
}