class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int maxlen=0;
        for(int rht=0;rht<s.length();rht++){
            while(set.contains(s.charAt(rht))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(rht));
            maxlen=Math.max(maxlen,rht-left+1);
        }
        return maxlen;
    }
}