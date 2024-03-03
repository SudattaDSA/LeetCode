class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] ans =new int[nums.length];
        int m=ans.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[k]=nums[i];
                k++;
            }
            else{
                ans[m-1]=nums[i];
                m--;
            }
        }
        return ans;
    }
}