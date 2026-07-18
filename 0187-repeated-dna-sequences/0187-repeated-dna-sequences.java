class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int left=0;
        int k=10;
        List<String> list=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>();
        for(int right=0;right<s.length();right++){
            String p=s.substring(left,right+1);
            
            if(right-left+1==k){
               
                mp.put(p,mp.getOrDefault(p,0)+1);
                if(mp.containsKey(p) && mp.get(p)==2){
                    list.add(p);
                }
                
                
                
               
                left++;
            }
        }
        return list;
    }
}