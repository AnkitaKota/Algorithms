class Solution {
    int resultstart;
    int resultlength;
    public String longestPalindrome(String s) {
   
        if(s.length()<2)
            return s;
        
        for(int i=0;i<s.length()-1;i++)
        {
            expandRange(s,i,i);
            expandRange(s,i,i+1);
        }
      
    return s.substring(resultstart,resultstart+resultlength);    
        
}

public void expandRange(String s, int begin, int end) {
 
           while(begin>=0 && end<=s.length()-1 && s.charAt(end)==s.charAt(begin))
           {
            end++;
           begin--;
           }
         
           if(resultlength < end-begin-1)
           {
              resultstart = begin+1;
              resultlength = end-begin-1;
           }
       
    
     
    
  }
}