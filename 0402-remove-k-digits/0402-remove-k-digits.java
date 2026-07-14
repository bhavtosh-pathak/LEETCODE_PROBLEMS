class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            int d=ch-'0';
            while(k>0 && !st.isEmpty() && st.peek()>d){
                st.pop();
                k--;
            }
            st.push(d);
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0'){
            i++;
        }
        if(i==sb.length()){
            return "0";
        }
        return sb.substring(i);
    }
}