// [1,8,6,2,5,4,8,3,7]

class Solution {
    public int maxArea(int[] height) {
        int firstmax,secondmax;
        firstmax = secondmax = 0;
        int i = 0;
        int j = height.length -1;
         int maxarea = 0;
        
        while(i<j)
        {
            if(height[i]<height[j])
            {
               maxarea = Math.max(maxarea, height[i] * (j-i)); 
                i++;
            }
            else
            {
              maxarea = Math.max(maxarea, height[j] * (j-i));   
              j--;
            }
        }
        
        
        
        
     return maxarea;   
        
        
        
        
    }
}