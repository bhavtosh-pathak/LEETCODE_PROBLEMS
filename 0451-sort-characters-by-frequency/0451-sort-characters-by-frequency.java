class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        for(char ph:mp.keySet()){
            pq.add(ph);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            int x=mp.get(pq.peek());
            for(int i=0;i<x;i++){
                sb.append(pq.peek());
            }
            pq.remove();
        }
        return sb.toString();
       
    }
}