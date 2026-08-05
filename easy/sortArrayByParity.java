class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            // If the left element is odd and right element is even, swap them
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            
            // Advance left pointer if it's already pointing to an even number
            if (nums[left] % 2 == 0) {
                left++;
            }
            // Retract right pointer if it's already pointing to an odd number
            if (nums[right] % 2 != 0) {
                right--;
            }
        }
        
        return nums;
    }
}
