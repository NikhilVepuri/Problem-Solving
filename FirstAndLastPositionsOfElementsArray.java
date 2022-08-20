class Solution {
    public int[] searchRange(int[] nums, int target) {
         int res[]=new int[]{-1,-1};
         int left=0;
         int right=nums.length-1;
         int mid=left+(right-left)/2;
            while(left<=right){
                   mid=left+(right-left)/2;
                    if(nums[mid]==target){
                        right=mid-1;
                        res[0]=mid;
                    }
                    else if(nums[mid]>target)
                        right=mid-1;
                    else
                        left=mid+1;
            }
            left=0;
            right=nums.length-1;
            while(left<=right){
                mid=left+(right-left)/2;
                if(nums[mid]==target){
                   left=mid+1;
                   res[1]=mid;
                }
                else if(nums[mid]>target){
                    right=mid-1;
                }
                else
                    left=mid+1;              
            }
        return res;
            
    }
}