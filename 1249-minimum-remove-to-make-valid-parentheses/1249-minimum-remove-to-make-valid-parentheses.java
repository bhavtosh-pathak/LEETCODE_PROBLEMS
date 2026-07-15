class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int  open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
                st.push(ch);
            }
            else if(ch==')'){
                if(open>0){
                    open--;
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder  sb=new StringBuilder();
        while(!st.isEmpty()){
            char ch=st.pop();
            if(ch=='(' && open>0){
                open--;
                continue;
            }
            else{

                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
}