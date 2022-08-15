#1
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=-1;
        boolean found=false;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                if(found==false)
                {
                    k=i;
                    found=true;
                    continue;
                }
                else    continue;
            }
            
            else if(k==-1)  continue;
            
            else nums[k++]=nums[i];   
        }
        
        if(found) return k;
        
        else      return nums.length;
        
    }
}

#2
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        boolean found=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                if(found==false)
                {
                    k=i;
                    found=true;
                continue;
                }
                else continue;
            }
        
            else   nums[k++]=nums[i];  
        }
        return k;
    }
}