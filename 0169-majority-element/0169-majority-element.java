class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int element=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element = nums[i];
            }
            count += element==nums[i]? 1:-1;
        }
        return element;
    }
}