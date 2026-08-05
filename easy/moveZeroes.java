class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        int interpos=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){

                temp=nums[i];
                nums[i]=nums[interpos];
               nums[interpos]=temp;
            
           interpos++;
            }
            }

        
    }
