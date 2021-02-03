class Solution {
    
    public HashMap<Character,Character> mapping = new HashMap<Character,Character>(); 
    Stack<Character> st = new Stack<Character>();
     
          public boolean isValid(String s) {
              
                    mapping.put(')','(');
                    mapping.put(']','[');
                    mapping.put('}','{');
             
              for(int i=0;i<s.length();i++)
              {
                  if(mapping.containsKey(s.charAt(i)))
                  {
                       if(st.isEmpty())
                           st.push('#');
                      char top = st.pop();
                      if( top != mapping.get(s.charAt(i)))
                      {
                          return false;
                      }
                  }
                  else
                  {
                       st.push(s.charAt(i));
                  }
              }
return st.isEmpty();
     }
        
    }
   
  
  
