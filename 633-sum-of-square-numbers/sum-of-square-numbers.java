class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            long res=(left*left)+(right*right);
            if(res==c){
                return true;
            }else if(res<c){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}