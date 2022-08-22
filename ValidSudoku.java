class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> seen = new HashSet<String>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char curr_val=board[i][j];
                if(curr_val!='.'){
                    if(!seen.add(curr_val+" val of row "+i)||
                        !seen.add(curr_val+" val of col "+j)||
                        !seen.add(curr_val+" val in subbox "+i/3+"-"+j/3)) return false;
                }
            }
           
        }
         return true;
    }
}