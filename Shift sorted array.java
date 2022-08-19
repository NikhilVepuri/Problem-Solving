class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)
            return -1;
       int left=0;
       int right=nums.length-1;
       
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right])
            {
                left=mid+1;
            }
            else
                right=mid;
        }
        int start=left;
        left=0;
        right=nums.length-1;
        
            if(target>=nums[start]&&target<=nums[right])
                left=start;
            else
                right=start;
       while(left<=right)
       {
          int mid=left+(right-left)/2;
           if(nums[mid]==target)
               return mid;
           else{
               if(nums[mid]>target)
                   right=mid-1;
               else
                   left=mid+1;
           }
       }
        return -1;
    }
}
//             int low=0;
//     int high= nums.length - 1;
//     int mid=low+(high-low)/2;

//     while(low <= high){
//         if(nums[mid] == target)
//             return mid;
        
        
//         else if(nums[low] <= nums[mid]){
//             if(nums[low] <= target && nums[mid] > target)
//                 high=mid-1;
//             else
//                 low=mid+1;
//         }
        
//         else if(nums[mid] <= nums[high]){
//             if(nums[mid] < target && nums[high] >= target){
//                 low=mid+1;
//             }
//             else
//                 high=mid-1;
//         }
        
//         mid=low+(high-low)/2;
//     }
//     return -1;
     
//     }
// }