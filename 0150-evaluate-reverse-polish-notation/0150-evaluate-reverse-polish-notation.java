class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int x=0;
        int y=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                 x=st.pop();
                 y=st.pop();
                st.push(x+y);
            }
            else if(tokens[i].equals("-")){
                x=st.pop();
                y=st.pop();
                st.push(y-x);
            }
            else if(tokens[i].equals("*")){
                x=st.pop();
                y=st.pop();
                st.push(x*y);
            }
            else if(tokens[i].equals("/")){
                x=st.pop();
                y=st.pop();
                st.push(y/x);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}