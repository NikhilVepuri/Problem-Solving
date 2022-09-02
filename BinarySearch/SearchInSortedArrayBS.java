class Solution {
    public boolean search(int[] nums, int target) {
            
       int left=0;
       int right=nums.length-1;
        int start =0;
        int mid=(left+right)/2;
       if(nums[mid]==nums[right]&&nums[mid]==nums[left]){ 
         while(left<right){
            if(nums[mid]==nums[right]&&nums[mid]==nums[left]){
                left++;
                right--;
            }
            else if(nums[mid]<nums[right]){
                start=right+1;
             break;
            }
             else{
                 start=left+1;
                 break;
             }
        }
       }
       else{
        while(left<right)
        {
             mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }            
            else 
                right=mid;
        }
            start = left;
        }
       
        left=0;
        right=nums.length-1;
       // System.out.println("start"+start);
        
        if(target>=nums[start]&&target<=nums[right])
                left=start;
        else
                right=start;
       while(left<=right)
       {
           mid=left+(right-left)/2;
           if(nums[mid]==target)
               return true;
           else{
               if(nums[mid]>target)
                   right=mid-1;
               else
                   left=mid+1;
           }
       }
        return false;

    }
}