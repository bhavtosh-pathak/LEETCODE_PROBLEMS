class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:tasks){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:mp.values()){
            pq.add(x);
        }
        int time=0;
        while(!pq.isEmpty()){
            List<Integer> list=new ArrayList<>();
            for(int i=1;i<=n+1;i++){
                if(!pq.isEmpty()){
                    int a=pq.peek();
                    pq.poll();
                    a--;
                 
                        list.add(a);
                    
                }
            }
             for(int p:list){
                if(p>0){
                    pq.add(p);
                }
            }   

            if(!pq.isEmpty()){
                time+=n+1;
            }
            else{
                time+=list.size();
            }  
                   
        }
        return time;
    }
}