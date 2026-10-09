class Solution {
    public int maxProduct(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }else if(i>secondLargest){
                secondLargest=i;
            }
        }
        return (largest-1)*(secondLargest-1);
    }
}