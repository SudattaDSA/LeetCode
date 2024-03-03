class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Set<Integer> s=new HashSet<>();
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i:hm.values()){
            if(!s.add(i)){
                return false;
            }
        }
        return true;
    }
}