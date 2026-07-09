class Solution {
    public String customSortString(String order, String s) {
        boolean[] visited=new boolean[s.length()];
        String p="";
        for(int i=0;i<order.length();i++){
            for(int j=0;j<s.length();j++){
                if(!visited[j] && order.charAt(i)==s.charAt(j)){
                    p+=order.charAt(i);
                    visited[j]=true;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(!visited[i]){
                p+=s.charAt(i);
            }
        }
        return p;
        
    }
}