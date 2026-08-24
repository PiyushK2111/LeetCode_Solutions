class Solution {
    public boolean isPalindromic(String s) {
        String b="";
        for (char ch: s.toCharArray()){
            String bits=Integer.toBinaryString(ch);
            while(bits.length()<8){
                bits="0"+bits;
            }
            b+=bits;
        }
        String rev= new StringBuilder(b).reverse().toString();
        return b.equals(rev);
    }
}