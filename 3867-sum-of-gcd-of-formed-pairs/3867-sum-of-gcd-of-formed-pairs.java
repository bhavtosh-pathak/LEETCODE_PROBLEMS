class Solution {
    public int gcd(int n,int max){
        int gcd=0;
        while(max!=0){
            int temp=max;
            max=n%max;
            n=temp;
        }
        return n;
    }
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int[] mx=new int[nums.length];
        int[] gcdArr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            mx[i]=max;
            gcdArr[i]=gcd(nums[i],max);
        }
        Arrays.sort(gcdArr);
        int i=0;
        int j=gcdArr.length-1;
        long sum=0;
        while(i<j){
            int x = gcd(gcdArr[i],gcdArr[j]);
            sum+=x;
            i++;
            j--;
        }
        return sum;

    }
}