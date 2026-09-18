class Solution {
    public static void generate(int n,String ans,List<String> list,int open,int close){
        if(ans.length()==2*n){
            list.add(ans);
        }
        if(open<n){
            generate(n,ans+"(",list,open+1,close);
        }
        if(open>close){
            generate(n,ans+")",list,open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate(n,"",list,0,0);
        return list;
    }
}