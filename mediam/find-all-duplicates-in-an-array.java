import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Get the absolute value since elements might have been negated
            int currentVal = Math.abs(nums[i]);
            
            // Map the value to its zero-based index counterpart
            int targetIndex = currentVal - 1;
            
            // If the value at targetIndex is already negative, we found a duplicate
            if (nums[targetIndex] < 0) {
                duplicates.add(currentVal);
            } else {
                // Otherwise, mark it as visited by negating it
                nums[targetIndex] = -nums[targetIndex];
            }
        }
        
        return duplicates;
    }
}
