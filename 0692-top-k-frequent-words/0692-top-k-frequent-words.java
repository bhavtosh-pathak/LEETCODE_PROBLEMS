class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> mp=new HashMap<>();
        for(String s:words){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(mp.get(a).equals(mp.get(b))){
                return b.compareTo(a);
            }
            else {
                return mp.get(a)-mp.get(b);
            }
        });
        for(String p:mp.keySet()){
            pq.add(p);
            if(pq.size()>k){
                pq.remove();
            }
        }
        List<String> list=new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.remove());
        }
        Collections.reverse(list);
        return list;

    }
}