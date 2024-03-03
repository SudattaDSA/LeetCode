class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>(n/4))
                return i;
        }
        return -1;
    }
}