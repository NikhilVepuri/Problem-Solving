class Solution {
    public void nextPermutation(int[] nums) {
         int i=nums.length-1;
         int j=nums.length-2;
         int k=0;
            while(j>=0 && nums[i]<=nums[j])        
            {
                j--;
                i--;
            }
     
        if(j>=0){
            k=nums.length-1;
            while(k>=0 && nums[j]>=nums[k]){
                k--;
            }
          
            int  temp=nums[k];
            nums[k]=nums[j];
            nums[j]=temp;
             Arrays.sort(nums,j+1,nums.length);
        }
        else
        {
             Arrays.sort(nums,0,nums.length);
        }
}
}