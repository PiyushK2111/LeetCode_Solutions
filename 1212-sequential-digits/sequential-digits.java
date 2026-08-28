class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        String digits="123456789";
        int llen=String.valueOf(low).length();
        int hlen=String.valueOf(high).length();
        for(int len=llen;len<=hlen;len++){
            for(int i=0;i<=9-len;i++){
                int num=Integer.parseInt(digits.substring(i,i+len));
                if(num>=low && num<=high){
                    res.add(num);
                }
            }
        }
        return res;
    }
}
