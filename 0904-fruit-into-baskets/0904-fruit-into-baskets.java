class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int right=0;right<fruits.length;right++){
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            if(mp.size()<=2){
                max=Math.max(max,(right-left+1));
            }
            while(mp.size()>2){
                mp.put(fruits[left],mp.getOrDefault(fruits[left],0)-1);
                if(mp.get(fruits[left])==0){
                    mp.remove(fruits[left]);
                }
                left++;
            }
        }
        return max;
    }
}