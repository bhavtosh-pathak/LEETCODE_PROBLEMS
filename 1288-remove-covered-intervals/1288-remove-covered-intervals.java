class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int cnt=0;
        boolean[] covered=new boolean[intervals.length];
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(i==j) continue;
                if(intervals[i][0]>=intervals[j][0] && intervals[j][1]>=intervals[i][1]){
                    covered[i]=true;
                    break;

                }
            }
        }
        for(boolean x:covered){
            if(!x) cnt++;
        }
        return cnt;
    }
}