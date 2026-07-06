class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> mp=new HashMap<>();
        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);

        }
        Arrays.sort(heights);
        String[] arr=new String[names.length];
        int k=0;
        for(int i=heights.length-1;i>=0;i--){
            arr[k++]=mp.get(heights[i]);
        }
        return arr;
    }
}