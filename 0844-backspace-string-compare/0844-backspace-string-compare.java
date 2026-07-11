class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!='#'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                st.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        for(char ch:t.toCharArray()){
            if(ch!='#'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                st.pop();
                }
               
            }
        }
        StringBuilder pb=new StringBuilder();
        while(!st.isEmpty()){
            pb.append(st.pop());
        }
        return sb.reverse().toString().equals(pb.reverse().toString());
    }
}