class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        for(;n!=0;n=n/10){
            int digit=n%10;
            pro=pro*digit;
            sum=sum+digit;
        }
        int result=pro-sum;
        return result;
    }
}