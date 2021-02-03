class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int i=0;
       
            for(int j=0;j<matrix.length;j++)
            {
                if(target>=matrix[j][0] && target <=matrix[j][matrix[0].length-1])
                {
                    while(i<matrix[0].length)
                    {
                       if(target==matrix[j][i])
                           return true;
                        else i++;
                       
                    }
                    break;
                        
                }
            }
        
        
        
    return false;    
        
        
        
        
        
        
        
        
    }
}