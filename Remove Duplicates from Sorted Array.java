class Solution {
  public static int removeDuplicates(int[] nums) {
      int x=0,y=1;
      while(y<nums.length)
      {
          if(nums[x]!=nums[y])
          {
              x++;
              nums[x]=nums[y];
          }
          y++;
          
      }
      return x+1;
      
      }
}