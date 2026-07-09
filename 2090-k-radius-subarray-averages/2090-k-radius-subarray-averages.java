class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if((i-k)<0 || (i+k)>=n){
                list.add(-1);
            }
            else{
                long sum=0;
                for(int j=i-k;j<=i+k;j++){
                    sum+=nums[j];
                }
                list.add((int)(sum/(2*k+1)));
            }

        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}