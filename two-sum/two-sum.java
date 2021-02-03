class Solution {
    public int[] twoSum(int[] nums, int target) {
       int secondNumber;
    
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    int index[] = new int[2];
       for(int i=0;i<nums.length;i++)
       {
          map.put(nums[i],i); 
       }
      
       for(int i=0;i<nums.length;i++)
       {
             int compliment = target - nums[i];
           
             if(map.containsKey(compliment) && map.get(compliment) != i)
             {
                index[0] = i;
                index[1] = map.get(compliment);
                 break;
             }
         
       }
       
     return index;   
        
        
        
    }
    
}