class Solution {
     public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with the number at its correct position
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in place, the missing number is n + 1
        return n + 1;
    }

}