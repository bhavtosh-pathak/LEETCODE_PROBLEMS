class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] arr=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        for(int i=temp.length-1;i>=0;i--){
            while(st.size()!=0 && temp[i]>=temp[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                arr[i]=0;
            }
            else{
                arr[i]=Math.abs(i-st.peek());
            }
            st.push(i);
        }
        return arr;
    }
}