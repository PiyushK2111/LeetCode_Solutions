class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long check1=(long)Math.max(need1,need2)*costBoth;
        long check2=(long)need1*cost1+(long)need2*cost2;
        long common=Math.min(need1,need2);
        long check3=common*costBoth+(need1-common)*cost1+(need2-common)*cost2;
        return Math.min(check1,Math.min(check2,check3));
    }
}