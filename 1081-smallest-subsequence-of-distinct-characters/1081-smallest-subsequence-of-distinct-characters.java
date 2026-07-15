class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st=new Stack<>();
        int[] freq=new int[26];
        boolean[] visited=new boolean[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']--;
            if(visited[ch-'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>0){
                visited[st.pop()-'a']=false;
            }

            st.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }

}