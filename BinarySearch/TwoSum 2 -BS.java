class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
    
    int left=0,right=numbers.length-1;
    
    while(left<right)
    {
        int sum=numbers[left]+numbers[right];
        if(sum==target)
            return new int[]{left+1,right+1};
        else if(sum>target)
            right--;
        else if(sum<target)
            left++;
    }
    return new int[]{};
}
}
//         int left = 0;
//         int right = numbers.length - 1;
//         int temp = 0;
//         int res []  = new int [2];
//         while(left <= right){
//             int mid = left + (right - left)/2;
//           //   System.out.println("mid"+mid+" roght"+right);
//             if((target - numbers[mid]) < numbers[mid]){
//                 temp = searchElement(0, numbers.length - 1, numbers[mid], numbers, target);
                
//                 if(temp != -1 && temp!=mid){
//                     res[0] = temp+1;
//                     res[1] = mid+1;
//                     return res;
//                 }
//                 else
//                     right = mid - 1;
//             }
//             else if((target - numbers[mid]) > numbers[mid]){
//                   temp = searchElement(0, numbers.length - 1, numbers[mid], numbers, target);
//                 if(temp != -1 && temp!=mid){
//                     res[0] = mid+1;
//                     res[1] = temp+1;
//                 return res;
//                 }
//                 else
//                     left = mid + 1;
//             }      
//             else
//                 left = mid + 1;
           
//         }
//          return res;
//     }
//    int searchElement(int left, int right, int k, int[] numbers, int target){
//         while(left <= right){
//             int mid1 = left + (right - left)/2;
//             if(numbers[mid1] == target - k)
//                 return mid1;
//             else if(numbers[mid1] > target - k)
//                 right = mid1 - 1;
//             else if(numbers[mid1] < target - k)
//                 left = mid1 + 1;
//         }
//         return -1;
//     }
