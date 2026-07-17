class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k){
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        
        for(int i=0;i<nums1.length;i++){
            int sum=0;
            for(int j=0;j<nums2.length;j++){
                sum=nums1[i]+nums2[j];
                if(pq.size()<k){
                    pq.add(new int[]{sum,nums1[i],nums2[j]});
                }
                else if(pq.peek()[0]>sum){
                    pq.remove();
                    pq.add(new int[]{sum,nums1[i],nums2[j]});
                }
                else{
                    break;
                }
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        while(!pq.isEmpty()){
            int[] curr=pq.remove();
            list.add(Arrays.asList(curr[1],curr[2]));
        }
        return list;
    }
}