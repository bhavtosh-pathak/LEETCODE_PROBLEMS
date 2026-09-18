class Solution {
    public static void validStrings(int n,String ans,int idx,List<String> list){
        if(idx==n){
            boolean flag=false;
            for(int i=1;i<ans.length();i++){
                if(ans.charAt(i)=='0' && ans.charAt(i-1)=='0'){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                list.add(ans);
            }
            return;
        }
        validStrings(n,ans+"0",idx+1,list);
        validStrings(n,ans+"1",idx+1,list);
    }
    public List<String> validStrings(int n) {
        List<String> list=new ArrayList<>();
        validStrings(n,"",0,list);
        return list;
    }
}