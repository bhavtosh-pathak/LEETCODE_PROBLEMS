class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
        for(int n:mp.keySet()){
            pq.add(n);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[] arr=new int[pq.size()];
        int idx=0;
        while(!pq.isEmpty()){
            arr[idx++]=pq.remove();
        }
        return arr;
       
    }
}