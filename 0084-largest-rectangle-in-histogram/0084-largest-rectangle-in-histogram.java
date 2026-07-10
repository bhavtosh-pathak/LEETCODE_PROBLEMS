class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] lse=new int[n];
        int[] rse=new int[n];
        Stack<Integer> st=new Stack<>();
        Stack<Integer> pt=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                lse[i]=-1;
            }
            else{
                lse[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=heights.length-1;i>=0;i--){
            while(!pt.isEmpty() && heights[i]<=heights[pt.peek()]){
                pt.pop();
            }
            if(pt.isEmpty()){
                rse[i]=n;
            }
            else{
                rse[i]=pt.peek();
            }
            pt.push(i);
        }
        int max=Integer.MIN_VALUE;
        int area=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,(heights[i])*(rse[i]-lse[i]-1));

        }
        return max;
    }
}