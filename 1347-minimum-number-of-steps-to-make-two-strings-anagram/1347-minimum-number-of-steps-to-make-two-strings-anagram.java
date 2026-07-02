class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int cnt=0;
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ph:t.toCharArray()){
            if(mp.containsKey(ph)){
                mp.put(ph,mp.getOrDefault(ph,0)-1);
                if(mp.get(ph)==0){
                    mp.remove(ph);
                }
            }
            else{
                cnt++;
            }
        }
        return cnt;
    }
}