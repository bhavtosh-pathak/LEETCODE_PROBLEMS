class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            int ascii=(int)ch;
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                
                boolean found=false;
                int pscii=(int)st.peek();
                if(!st.isEmpty() && Math.abs(ascii-pscii)==32){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}