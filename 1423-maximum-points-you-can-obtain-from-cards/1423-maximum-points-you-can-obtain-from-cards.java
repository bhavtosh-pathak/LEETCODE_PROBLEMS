class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int n=cardPoints.length;
      
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
            
        }
        int max=sum;
        int left=k-1;
        int right=cardPoints.length-1;
        while(left>=0){
            sum-=cardPoints[left];
            sum+=cardPoints[right];
            left--;
            right--;
            max=Math.max(max,sum);
        }
        return max;
    }
}