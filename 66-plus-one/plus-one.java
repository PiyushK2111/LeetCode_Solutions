class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]+=1;
        for(int i=digits.length-1;i>=1;i--){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]+=1;
            }
        }
        if(digits[0]==10){
            int[]res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
        
    }
}