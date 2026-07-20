class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        for(int x:hand){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        while(!mp.isEmpty()){
            int first=mp.firstKey();
            for(int i=0;i<groupSize;i++){
                int cards=first+i;
                if(!mp.containsKey(cards)){
                    return false;
                }
                mp.put(cards,mp.getOrDefault(cards,0)-1);
                if(mp.get(cards)==0){
                    mp.remove(cards);
                }
            }
        }
        return true;

    }
}