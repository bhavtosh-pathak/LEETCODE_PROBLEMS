class Solution {
    public int subarrayWithKDistinct(int[] nums,int k){
        int left=0;
        int cnt=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.size()>k){
                mp.put(nums[left],mp.getOrDefault(nums[left],0)-1);
                if(mp.get(nums[left])==0){
                    mp.remove(nums[left]);
                }
                left++;
            }
            cnt+=(right-left+1);
        }
        return cnt;

    }

     public int subarrayWithKDistincts(int[] nums,int k){
        int left=0;
        int cnt=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            while(mp.size()>k){
                mp.put(nums[left],mp.getOrDefault(nums[left],0)-1);
                if(mp.get(nums[left])==0){
                    mp.remove(nums[left]);
                }
                left++;
            }
            cnt+=(right-left+1);
        }
        return cnt;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarrayWithKDistinct(nums,k)-subarrayWithKDistincts(nums,k-1);
    }
}