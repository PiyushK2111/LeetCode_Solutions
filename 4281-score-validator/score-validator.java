class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int count=0;
        for(String s:events){
            if(count==10){
                break;
            }
            if(s.equals("W")){
                count++;
            }else if(s.equals("WD")|| s.equals("NB")){
                score++;
            }else{
                score+=Integer.parseInt(s);
            }
        }
        return new int[]{score,count};
    }
}