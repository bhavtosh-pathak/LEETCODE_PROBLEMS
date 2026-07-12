class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch) || ch=='['){
                st.push(ch);
            }
            else{
                StringBuilder sb=new StringBuilder();
                while(st.peek()!='['){
                    sb.append(st.pop());
                }
                String str=sb.reverse().toString();
                st.pop();
                StringBuilder num=new StringBuilder();
                while(!st.isEmpty()  && Character.isDigit(st.peek())){
                    num.append(st.pop());
                }
                num.reverse();
                int n=Integer.parseInt(num.toString());
                while(n-->0){
                    for(char ph:str.toCharArray()){
                        st.push(ph);
                    }
                    
                }
            }
            
        }

        StringBuilder ans=new  StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}