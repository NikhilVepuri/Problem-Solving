//Here assigning first digit letters to the variable res and the next digit letters to the variable str and appending all the possible combinations to the variable temp. In the same way for the remaining digits.
//Lets say for 234, combinations for 23 will be found first and then combinations for "23"and 4 will be found

class Solution {
      public List<String> letterCombinations(String digits) {
           HashMap<Character, List<String>> hm=new HashMap<>();
             hm.put('2',Arrays.asList("a","b","c"));
             hm.put('3',Arrays.asList("d","e","f"));
             hm.put('4',Arrays.asList("g","h","i"));
             hm.put('5',Arrays.asList("j","k","l"));
             hm.put('6',Arrays.asList("m","n","o"));
             hm.put('7',Arrays.asList("p","q","r","s"));
             hm.put('8',Arrays.asList("t","u","v"));
             hm.put('9',Arrays.asList("w","x","y","z"));
      
          List<String> res=new ArrayList<String>();
         
          
          for(char ch: digits.toCharArray())
          {
              List<String> str=hm.get(ch);
              if(res.size()==0)
              {
                  for(String s:str)
                      res.add(s);
                  continue;
              }
              
              List<String> temp=new ArrayList<String>();
              for(int i=0;i<res.size();i++)
              {
                  for(int j=0;j<str.size();j++)
                  {
                      temp.add(res.get(i)+str.get(j));
                  }
              }
              res=temp;
          }
          return res;
    
    
    }
}