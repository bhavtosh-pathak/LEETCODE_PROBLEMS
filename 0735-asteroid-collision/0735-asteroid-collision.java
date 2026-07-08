class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list=new ArrayList<>();
        for(int x:asteroids){
            list.add(x);
        }
        while(true){
            boolean collision=false;
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>0 && list.get(i+1)<0){
                    if(Math.abs(list.get(i))>Math.abs(list.get(i+1))){
                        list.remove(i+1);
                    }
                    else if(Math.abs(list.get(i))<Math.abs(list.get(i+1))){
                        list.remove(i);
                    }
                    else{
                        list.remove(i+1);
                        list.remove(i);
                        
                    }
                    collision=true;
                    break;
                }
            }
            if(!collision){
                break;
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;

    }
}