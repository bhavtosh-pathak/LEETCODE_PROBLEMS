class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int j=i;j<s.length();j++){
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int x:mp.values()){
                    max=Math.max(max,x);
                    min=Math.min(min,x);
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
}