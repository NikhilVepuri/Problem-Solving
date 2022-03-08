class Solution {
    public boolean containsDuplicate(int[] arr) {
        Approach 1:
        // HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(hmap.containsValue(arr[i]))
        //        {
        //            return true;
        //        }
        //     else
        //        hmap.put(i,arr[i]);
        // }
        //        return false;
        
        Approach 2:
          // boolean flag=false;
          //   int temp=0;
          //    HashSet<Integer> hset = 
          //          new HashSet<Integer>();
          //  for(int i=0;i<arr.length;i++)
          //  {
          //      hset.add(arr[i]);
          //  }
          //  if(arr.length!=hset.size())
          //  {
          //      flag= true;
          //  }
          //     return flag;
        
        Approach 3:
          Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) { 
            // this way, we can catch and stop the algorithm at //first sight of a duplicate
                return true;
            }
            set.add(arr[i]);
        }
        return false;
        
    }
}
