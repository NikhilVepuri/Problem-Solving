class Solution {
    public String intToRoman(int num) {
 String ones[]=new String[]{"I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[]= new String[]{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreds[]=new String[]{"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousands[]=new String[]{"M","MM","MMM"};
        int temp=num;
        int count=0;
        ArrayList<String> rom=new ArrayList<String>();
       
        int mod=0;
        while(temp>0)
        {
            mod=temp%10;
           
          
            if(count==0&&mod!=0)
              rom.add(ones[mod-1]);
            else if(count==1&&mod!=0)
                rom.add(tens[mod-1]);
            else if(count==2&&mod!=0)
                rom.add(hundreds[mod-1]);
            else if(count==3)
                rom.add(thousands[mod-1]);
            else 
               {
                    count++;   
            temp=temp/10;
            continue;
               }
                
             count++;   
            temp=temp/10;
           
        }
        String res=new String();
        for(int i=rom.size()-1;i>=0;i--)
        {
            res=res+rom.get(i);
        }
        return res;
        
    }
}