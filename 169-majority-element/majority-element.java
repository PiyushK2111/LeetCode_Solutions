class Solution {
    public int majorityElement(int[] nums) {
        int count=0 ;
        int counter=0;
        for(int num:nums){
            if(count==0){
                counter=num;
            }
            if(num==counter){
                count+=1;
            }else{
                count-=1;
            }
        }
        return counter;
    }
}