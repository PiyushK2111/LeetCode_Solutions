class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalKm=0;
        while((mainTank/5)>0){
            mainTank-=5;
            totalKm+=5;
            if(additionalTank>0){
                mainTank+=1;
                additionalTank--;
            }
        }
        if(mainTank>0){
            totalKm+=mainTank;
        }else if(additionalTank>0){
            totalKm+=1;
        }
        return totalKm*10;
    }
}