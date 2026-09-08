class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        else if(n<=100000){
            int d=0;
            for(int i=1000;i<=n;i++){
                d++;
            }
            return d;
        }
        return 0;
    }
}