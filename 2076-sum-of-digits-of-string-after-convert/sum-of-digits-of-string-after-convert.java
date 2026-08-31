class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            int val=ch-'a'+1;
            sb.append(val);
        }
        while(k>0){
            int sum=0;
            for(int i=0;i<sb.length();i++){
                sum+=sb.charAt(i)-'0';
            }
            sb=new StringBuilder(String.valueOf(sum));
            k--;
        }
        return Integer.parseInt(sb.toString());
    }
}