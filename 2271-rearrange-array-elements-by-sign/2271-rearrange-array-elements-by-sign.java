class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer> ans = new ArrayList<>();
        ArrayList<Integer> lst1=new ArrayList<>();
        ArrayList<Integer> lst2=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                lst1.add(nums[i]);
            }
            else{
                lst2.add(nums[i]);
            }
        }
        int ind1 = 0, ind2 = 0;
        
        while (ind2 < nums.length / 2) {
            ans.add(lst1.get(ind1));
            ind1++;
            ans.add(lst2.get(ind2));
            ind2++;
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}