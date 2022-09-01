class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int m = matrix.length;
        int n=matrix[0].length;
        int right = (m*n)-1;
        
       while(left<=right){
           int mid=left+(right-left)/2;
          // System.out.println("mid"+mid);
          int mid_m=mid/n;
          int mid_n=mid%n;
           //System.out.println("right"+right+" left"+left+"mid_m"+mid_m+" mid_n"+mid_n);
           if(matrix[mid_m][mid_n]==target)
               return true;
           else if(matrix[mid_m][mid_n]>target)
               right=mid-1;
           else if(matrix[mid_m][mid_n]<target)
               left=mid+1;
       }
       return false;
        
    }
}