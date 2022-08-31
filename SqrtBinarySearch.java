class Solution {
    public int mySqrt(int x) {
        if(x<=1)
            return x;
        
        int left=1;
        int right=x-1;
        while(left<=right){
            long mid=left+(right-left)/2;
           
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid>x){
                right=(int)mid-1;
            }
            else if(mid*mid<x){
                left=(int)mid+1;
            }            
        }
        return right;
    }
}