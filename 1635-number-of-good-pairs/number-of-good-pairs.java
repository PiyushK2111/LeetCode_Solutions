class Solution {
    public int numIdenticalPairs(int[] nums) {
        int freq[]=new int[101];
        int count=0;
        for(int n:nums){
            freq[n]++;
        }
        for(int n:freq){
            count+=n*(n-1)/2;
        }
        return count;
    }
}