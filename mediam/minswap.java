class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        // Step 1: Count total number of 1's in the array
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }
        
        // Edge cases: If there are no 1's or all are 1's, 0 swaps are needed
        if (totalOnes == 0 || totalOnes == n) {
            return 0;
        }
        
        // Step 2: Initialize the first window of size 'totalOnes'
        int currentOnes = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }
        
        int maxOnesInWindow = currentOnes;
        
        // Step 3: Slide the window across the circular array
        // The loop runs up to n + totalOnes - 1 to cover all circular windows
        for (int i = 0; i < n; i++) {
            // Remove the element leaving the window from the left
            if (nums[i] == 1) {
                currentOnes--;
            }
            
            // Add the element entering the window from the right (using modulo for circular wrap)
            int incomingIndex = (i + totalOnes) % n;
            if (nums[incomingIndex] == 1) {
                currentOnes++;
            }
            
            // Track the maximum number of 1's seen in any valid window
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }
        
        // The minimum swaps needed is the window size minus the maximum 1's we can naturally group
        return totalOnes - maxOnesInWindow;
    }
}
