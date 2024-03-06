class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> al=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int start = nums[i];
            while(i+1<n && nums[i]+1==nums[i+1])
                i++;
            
            if(start!=nums[i])
                al.add(""+start+"->"+nums[i]);
            else
                al.add(""+start);
        }
        return al;
    }
}