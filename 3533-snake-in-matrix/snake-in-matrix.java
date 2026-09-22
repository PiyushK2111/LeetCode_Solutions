class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row=0;
        int col=0;
        for(String cmd:commands){
            if(cmd.equals("UP")){
                row--;
            }else if(cmd.equals("DOWN")){
                row++;
            }else if(cmd.equals("LEFT")){
                col--;
            }else if(cmd.equals("RIGHT")){
                col++;
            }
        }
        return row*n+col;
    }
}