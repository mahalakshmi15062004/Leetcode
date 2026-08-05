import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        // Step 1: Varisaya arrange panrom (Sorting)
        Arrays.sort(nums);
        int n = nums.length;
        
        // Case 1: Mika periya 3 positive numbers product logic
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
        // Case 2: Rendu periya negative numbers kooda top positive product logic (Negative * Negative = Positive)
        int option2 = nums[0] * nums[1] * nums[n - 1];
        
        // Return whichever is maximum
        return Math.max(option1, option2);
    }
}
