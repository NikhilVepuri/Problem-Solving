class Solution {
    public int minSubArrayLen(int target, int[] nums) {
               if(nums == null || nums.length == 0)
            return 0;
        
        int start =0,end =0,sum =0, min = Integer.MAX_VALUE;
        
        while(end < nums.length)
        {
            sum += nums[end++];
            
            while(sum >= target)
            {
                min = Math.min(min , end-start);
                sum = sum - nums[start++];
            }
        }
        
        if(min != Integer.MAX_VALUE)
            return min;
        else
            return 0;
    
    }
}

//   Arrays.sort(nums);
      //  int left = nums.length - 1;
      //  int right = nums.length - 1;
      //   int count = 1;
      //    if(nums[right] >= target)
      //           return 1;
      //   left--;
      //   count++;
      // int  sum = nums[right];
      //   while(left>=0)
      //   {
      //      if(nums[left]+sum >= target){
      //          return count;
      //      }
      //       sum = sum + nums[left];
      //       left--;
      //       count++;            
      //   }
      //   return 0;
