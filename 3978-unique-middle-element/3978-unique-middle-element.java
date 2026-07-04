class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int x=n/2;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        if(mp.get(nums[x])>1){
            return false;
        }
        return true;
    }
}