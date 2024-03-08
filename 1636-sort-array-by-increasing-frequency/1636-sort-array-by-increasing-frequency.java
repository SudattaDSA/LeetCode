class Solution {
    public int[] frequencySort(int[] nums) { 
	    
		//Array to hold frequecy of each number
        int[] freq =  new int[201];     
		
		//Recording the frequency of each number in freq array      
        for(int i=0;i<nums.length;i++){
            freq[nums[i]+100]++;      
        }
		//idenifying the unique numbers in nums array
        int unique=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!= 0){
                unique++;
            }
        }
        
        int min= 500;
        int minidx =-500;
        int j =0;
		//running the outer loop unique times
        for(int k =0; k<unique;k++){
		//finding the minimum frequency number and its index while igoring the value 0
            for(int i =0; i<freq.length;i++){
                if(freq[i]!=0 && freq[i]<=min){
                    min = freq[i];
                    minidx =i;
                }
            }
            //filling the nums array with the minimum frequency number 
            while(freq[minidx]>0 && j<nums.length){                
                    nums[j++] = minidx-100;
                    freq[minidx]--;                
            }
			// resetting the min
             min= 500;               
        }
        return nums;
    }     
}