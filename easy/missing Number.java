class Solution {
    public int missingNumber(int[] nums) {
      
        int size = nums.length ;
        int value = size *(size + 1)/2;
            
        int sum=0;
       
        for(int i=0; i<size; i++){
            sum= sum + nums[i];
        }
        int result = value - sum;
        return result ;
        
    }
}
        
    
