class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        boolean[] visited=new boolean[arr1.length];
        int[] arr=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    arr[k++]=arr2[i];
                    visited[j]=true;
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<arr1.length;j++){
            if(!visited[j]){
                list.add(arr1[j]);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            arr[k++]=list.get(i);
        }
        return arr;
    }
}