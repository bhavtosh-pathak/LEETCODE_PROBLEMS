class Solution {
    public int first(int[] nums,int k){
        int left=0;
        int cnt=0;
        int odd=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1){
                odd++;
            }
            
            while(odd>k){
                if(nums[left]%2!=0){
                    odd--;
                }
                left++;
            }

            cnt+=(right-left+1);
        }
        return cnt;
    }
    public int second(int[] nums,int k){
        int left=0;
        int cnt=0;
        int odd=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1){
                odd++;
            }
            
            while(odd>k){
                if(nums[left]%2!=0){
                    odd--;
                }
                left++;
            }
            cnt+=(right-left+1);
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return first(nums,k)-second(nums,k-1);
    }
}