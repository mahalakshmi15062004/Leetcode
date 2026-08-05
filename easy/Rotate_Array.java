class Solution {
    // Helper function to dynamically swap element spaces reverse boundaries
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handles situations if K is larger than size limits array lengths
        
        // 3-Step reversal core execution mapping
        reverse(nums, 0, n - 1); // Step 1: Full reverse
        reverse(nums, 0, k - 1); // Step 2: First K elements reverse
        reverse(nums, k, n - 1); // Step 3: Remaining elements reverse
    }
}
