//Step1 :Comparing length of two strings 
//Step2 :Iterarting upto the length of small string, if any character doesnt match, updating prefix to the length upto character mismatch. Slly comparing all the strings(2 strings at a time) and validating all the characters and updating prefix.
//Or
//Step1 : We can sort the string array 
//Step2 : Perform step 2 same as above (compare the strings until the end of array)
    
class Solution {
    public String longestCommonPrefix(String[] strs) {
     int prefix=strs[0].length();
        for(int i=1;i<strs.length;i++)
        {
            prefix=prefix<strs[i].length()?prefix:strs[i].length();
            if(prefix==0)
            {
                break;
            }
            int j=0;
            while(j<prefix)
            {
                if(strs[i-1].charAt(j)!=strs[i].charAt(j))
                {
                    prefix=j;
                    break;
                }
                j++;
            }   
        }
        return strs[0].substring(0,prefix);
        
        
    }
}