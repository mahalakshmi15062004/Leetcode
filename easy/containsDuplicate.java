class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        
        // Loop inside loop to compare every pair manually
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Match found! Contains duplicate entry parameters setup.
                }
            }
        }
        return false;
    }
}
