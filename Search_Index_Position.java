class Solution {
    public int searchInsert(int[] nums, int target) {
        // Step 1: Initialize the pointers
        int left = 0;
        int right = nums.length - 1;
        
        // Step 2: Implement the binary search loop
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Compare the middle element with the target
            if (nums[mid] == target) {
                return mid; // Target found, return the index
            } else if (nums[mid] < target) {
                left = mid + 1; // Move the left pointer to the right of mid
            } else {
                right = mid - 1; // Move the right pointer to the left of mid
            }
        }
        
        // Step 3: Return the insertion position if the target is not found
        return left;
    }}