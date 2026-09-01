 class Solution {
    void Reverse(int[]nums,int s,int e){
        while(e>s){
            int tmp=nums[s];
            nums[s]=nums[e];
            nums[e]=tmp;
            s++; 
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n; 
        Reverse(nums,0,n-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k,n-1);
    }
}