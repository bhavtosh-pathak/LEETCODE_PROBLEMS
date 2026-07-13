class Solution {
    public int longestSubstring(String s, int k) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                mp.put(ch,mp.getOrDefault(ch,0)+1);
                boolean valid=true;
                for(int n:mp.values()){
                    if(n<k){
                        valid=false;
                        break;
                    }
                }
                if(valid){
                    max=Math.max(max,j-i+1);
                }
            }
            
        }

        return max;
    }
}