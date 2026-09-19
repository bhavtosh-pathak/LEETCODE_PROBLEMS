class Solution {
    public static void solve(int idx,String ans,String digits,List<String> list,HashMap<Character,String> mp){
        if(ans.length()==digits.length()){
            list.add(ans);
            return;
        }
        char ch=digits.charAt(idx);
        String str=mp.get(ch);
        for(int i=0;i<str.length();i++){
            ans+=str.charAt(i);
            solve(idx+1,ans,digits,list,mp);
            ans=ans.substring(0,ans.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        HashMap<Character,String> mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        solve(0,"",digits,list,mp);
        return list;
    }
}