class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length==-1) return -1;
        if(nums.length==1 && target == nums[0]) return 0; 
        
      int start = 0;
      int end = nums.length -1;
    
     while(start<=end)
     {
        int mid = start + (end-start)/2;
         if(target == nums[mid])
             return mid;
         else if(nums[mid]>nums[end])
         {
             if(target<=nums[mid] && target>=nums[start])
             end = mid -1;
             
             else
              start = mid+1;
             
         }
        else 
         {
           if(target<=nums[end] && target >=nums[mid])
               start = mid+1;
            else
                end = mid-1;
            
         }
         
     }
        
   return -1;     
        
        
        
    }
}