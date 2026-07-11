class Solution {
    public String decodeAtIndex(String s, int k) {
        long size=0;
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                size++;
            }
            else{
                size*=(ch-'0');
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            k=(int)(k%size);
            char ph=s.charAt(i);
            if(Character.isLetter(ph)){
                if(k==0){
                    return ph+"";
                }
                else{
                    size--;
                }
            }
            else{
                int d=ph-'0';
                size/=d;

            
            }
        }
        return "";
    }
}