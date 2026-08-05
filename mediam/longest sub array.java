class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Include the current element in the window
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // If we have more than one zero, shrink the window from the left
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            // Calculate the valid subarray size (window size minus the deleted element)
            maxLen = Math.max(maxLen, right - left);
        }
        
        return maxLen;
    }
}
