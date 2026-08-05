class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        
        // Step 1: Array-oda continuous full elements sum find panrom
        for (int num : nums) {
            totalSum += num;
        }
        
        // Step 2: Index-by-index left and right sums balance check panrom
        for (int i = 0; i < nums.length; i++) {
            // totalSum - leftSum - nums[i] dynamically gives the right side sum
            if (leftSum == (totalSum - leftSum - nums[i])) {
                return i; // Balance spot found!
            }
            leftSum += nums[i]; // Update running left side sum
        }
        return -1;
    }
}
