class Solution {
     List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
          Arrays.sort(arr);
        List<Integer> path = new ArrayList();
    backtrack(path,0,target,arr);
    return res;
    }
     public void backtrack(List<Integer> path,int index, int target, int[] arr){
    
        
        if(target == 0){
            res.add(new ArrayList(path));
            return ;
        }

        if(target < 0) return ;
        
        if(index == arr.length) return ;
        
        path.add(arr[index]);
        backtrack(path, index, target - arr[index], arr);
        path.remove(path.size()-1);
        backtrack(path, index+1, target, arr );
    }
}