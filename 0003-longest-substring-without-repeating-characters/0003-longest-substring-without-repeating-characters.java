class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  left=0;
        int max=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>1){
                mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
                if(mp.get(s.charAt(left))==0){
                    mp.remove(s.charAt(left));
                }
                left++;
            }
            max=Math.max(max,(right-left+1));
        }
        return max;
    }
}