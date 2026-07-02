class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;
        boolean[] visited=new boolean[g.length];
        for(int i=0;i<s.length;i++){
            for(int j=0;j<g.length;j++){
                if(s[i]>=g[j] && !visited[j]){
                    visited[j]=true;
                    cnt+=1;
                    break;
                }
            }
        }
        return cnt;
    }
}