class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // 'i' is the index of the last unique element found
        int i = 0;

        // 'j' is the fast pointer that scans the array
        for (int j = 1; j < nums.length; j++) {
           
            if (nums[j] != nums[i]) {
             
                i++;
              
                nums[i] = nums[j];
            }
        }

        
        return i + 1;
    }
}
