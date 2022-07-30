//Step 1: Sort the array
//2: For each element(keeping it fixed and change the other 2 pointers) iterating the entire array. 3:In the inner loop if the sum is closer to target make the current sum as closest and if the curr sum is lesser than target move the hi pointer(towards left) or if the sum is greater than target move the lo pointer(towards right side) until 2pointer meet. 

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        int sum=0;
        for(int i=0;i<nums.length-2;i++)
        {
              int lo=i+1;
              int hi=nums.length-1;
            
           
            while(lo<hi)
            {
                 sum=nums[i]+nums[lo]+nums[hi];
                if(Math.abs(target-sum)<Math.abs(target-closest))
                {
                    closest=sum;
                    System.out.println("lo is"+lo+"sum is "+sum);
                } 
                if(sum<target)
                {
                    lo++;
                }
                else if(sum>target)
                {
                    System.out.println("sum is "+sum+" at lo"+lo);
                    hi--;
                }
                else
                    return sum; 
            }
        }
        return closest;

        
//         //tried with one loop but test case [4,0,5,-5,3,3,0,-4,-5] -2 failing(working on it)
// //         Arrays.sort(nums);
//         int res=Integer.MAX_VALUE;
//         int lo=0;
//         int hi=nums.length-1;
//         int i=0,j=nums.length-1;
//         int sum=0;
        
//         while(i<j-1)
//         {
//             if(Math.abs(target-nums[hi])<Math.abs(target-nums[lo]))
//             {
//                 sum=nums[hi]+nums[lo]+nums[j-1];
//                 System.out.println("hi"+nums[hi]+"lo"+nums[lo]+"sum is"+sum);
//                   if(Math.abs(target-sum)<Math.abs(target-res))
//                     res=sum;
//                 System.out.println("res is:"+res);
//                 i++;
//                 lo++;
//             }
//             else
//             {
//                 sum=nums[hi]+nums[lo]+nums[i+1];
//                 if(Math.abs(target-sum)<Math.abs(target-res))
//                     res=sum;
//                 j--;
//                 hi--;
//             }
//         }
//         return res;
    }
}