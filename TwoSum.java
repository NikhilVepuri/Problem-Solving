class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                 res=new int[]{map.get(nums[i]),i};
                break;
            }
            else
            {
                map.put(target-nums[i],i);
            }
        }
         return res;
}
}