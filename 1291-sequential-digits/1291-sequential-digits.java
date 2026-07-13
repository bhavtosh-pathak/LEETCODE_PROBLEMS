class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>  list=new ArrayList<>();
        String q="123456789";
        int start=String.valueOf(low).length();
        int end=String.valueOf(high).length();
        for(int i=start;i<=end;i++){
            int left=0;
            int right=i;
            while(right<=9){

                int n=Integer.parseInt(q.substring(left,right));
                if(n>=low && n<=high){
                    list.add(n);
                }

                left++;
                right++;
            }
        }
        return  list;
    }
}