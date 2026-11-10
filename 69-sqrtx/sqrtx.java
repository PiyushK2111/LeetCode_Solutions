class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        int initial=1;
        int end=x;
        int mid=-1;
        while(initial<=end){
            mid=initial+(end-initial)/2;
            if((long)mid*mid>(long)x){
                end=mid-1;
            }else if(mid*mid==x){
                return mid;
            }else{
                initial=mid+1;
            }
        }
        return (int)Math.round(end);
    }
}