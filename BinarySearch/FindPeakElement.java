class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int n = nums.length;
        while(left <= right){
            int mid = left + (right - left)/2;
            if((mid == left || nums[mid] > nums[mid-1]) && (mid == n-1 || nums[mid] > nums[mid+1]))
                return mid;
            else if(nums[mid+1] > nums[mid])
                // In BS we need to move on either one of the direction. Here we can observe that if are standing at some point and if we move on higher side we will always defenitely find a peak on that side
				// Consider you are on range of mountains and standing at a point. It is most certein that if you move on side which is going up you will defenitely find a peak on the mountain on that side
				// That is the reason here we are moving on the side where adjaced value of mid is greater than mid
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}