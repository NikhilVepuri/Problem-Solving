class Solution {
    
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         Arrays.sort(candidates);
        List<Integer> path = new ArrayList();       
        
        backtrack(0, target, path, candidates);
        return result;
    }
    public void backtrack(int index, int target, List path, int[] arr){
        if(target==0){
            result.add(new ArrayList(path));
            return;
        }
        
        if(target<0){
            return;
        }
        
        int prev=-1;
        for(int i=index;i<arr.length;i++){    
            if(arr[i] == prev)
                continue;
            path.add(arr[i]);
            backtrack(i+1, target-arr[i], path, arr);
            path.remove(path.size()-1);
            prev=arr[i];
        // backtrack(index+1,target, path, arr);
        }
        
    }
}