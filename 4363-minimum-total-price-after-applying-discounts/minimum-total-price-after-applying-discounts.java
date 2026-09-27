class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum=0;
        for(int i:prices){
            sum+=i;
        }
        int lp=prices.length-1;
        int ld=discounts.length-1;
        while(lp>=0 && ld>=0){
            sum-=(prices[lp]*discounts[ld])/100.0;
            lp--;
            ld--;
        }
        return sum;
    }
}