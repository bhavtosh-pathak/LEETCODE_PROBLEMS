class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>  list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        Arrays.sort(nums);
        int x=nums[0];
        int y=nums[nums.length-1];
        for(int p:nums){
            set.add(p);
        }
        for(int i=x;i<=y;i++){
            if(!set.contains(i)){

                list.add(i);
            }
        }
        return list;
    }
}