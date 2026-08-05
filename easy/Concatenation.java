class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; // Allocating double sized array memory block
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];     // Copying to first half
            ans[i + n] = nums[i]; // Copying to second half matching offset
        }
        return ans;
    }
}
