class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax=0.0;
        int prev=0;
        for(int[]bracket:brackets){
            int upper=bracket[0];
            int percent=bracket[1];
            int taxableIncome=Math.min(income,upper)-prev;
            if(taxableIncome>0){
                tax+=(double)taxableIncome*percent/100;
            }
            prev=upper;
        }
        return tax;
    }
}