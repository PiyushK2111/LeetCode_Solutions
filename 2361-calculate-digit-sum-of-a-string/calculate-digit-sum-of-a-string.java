class Solution {
    public String digitSum(String s, int k){
        while (s.length()>k){
            StringBuilder temp=new StringBuilder();
            int i=0;
            while(i<s.length()){
                int sum=0;
                int repeat=k;
                while (i<s.length() && repeat-->0){
                    sum+=s.charAt(i)-'0';
                    i++;
                }
                temp.append(sum);
            }
            s=temp.toString();
        }
        return s;
    }
}