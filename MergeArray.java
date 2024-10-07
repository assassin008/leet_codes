public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Index of the last element in nums1 after merging
        int index = m + n - 1;
        
        // Index for the last valid element in nums1
        int i = m - 1;
        
        // Index for the last element in nums2
        int j = n - 1;

        // Iterate through nums1 and nums2 from the back, placing the larger element at the end of nums1
        while (i >= 0 && j >= 0) {
            // Compare the current elements of nums1 and nums2
            if (nums1[i] > nums2[j]) {
                // If nums1 has the larger element, place it at the current index in nums1
                nums1[index] = nums1[i];
                i--; // Move the index of nums1 backwards
            } else {
                // If nums2 has the larger element, place it at the current index in nums1
                nums1[index] = nums2[j];
                j--; // Move the index of nums2 backwards
            }
            index--; // Move the index of the final array backwards
        }

        // If there are any elements left in nums2, copy them into nums1
        // This is necessary in case nums1's elements have all been placed and nums2 still has remaining elements
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }
    }}