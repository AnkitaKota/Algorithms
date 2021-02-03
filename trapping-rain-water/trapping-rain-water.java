class Solution {
    public int trap(int[] height) {
     
        int[] left = new int[height.length+1];
     
        int total =0;
        left[0] =0;
        int right = 0;
        
        for(int i=0;i<height.length;i++)
        {
           left[i+1] = Math.max(left[i],height[i]); 
        }
        for(int i=height.length-1 ; i>0;i--)
        {
            
           right = Math.max(right,height[i]);
           total +=Math.min(left[i],right) >height[i] ? Math.min(left[i],right) - height[i] :0;
            
            
        }
       
       
        
        
        
       return total; 
        
    }
}