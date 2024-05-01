class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array to minimize the binary search range
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);  // Swap if nums1 is longer
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m, halfLen = (m + n + 1) / 2;  // halfLen is the half of the combined array length, +1 for odd total length handling

        while (low <= high) {
            int i = (low + high) / 2;  // Binary search on the smaller array
            int j = halfLen - i;  // j is calculated to balance the elements on each side of the partition

            // Now we need to check if we have the right partition
            if (i < high && nums2[j - 1] > nums1[i]) {
                // This means nums1[i] is too small, we need to move i to the right
                low = i + 1;
            } else if (i > low && nums1[i - 1] > nums2[j]) {
                // This means nums1[i - 1] is too big, we need to move i to the left
                high = i - 1;
            } else {
                // We've found the correct partition
                int maxLeft = 0;
                if (i == 0) { maxLeft = nums2[j - 1]; }
                else if (j == 0) { maxLeft = nums1[i - 1]; }
                else { maxLeft = Math.max(nums1[i - 1], nums2[j - 1]); }

                if ((m + n) % 2 == 1) {  // If the length of the combined array is odd, the median is maxLeft
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) { minRight = nums2[j]; }
                else if (j == n) { minRight = nums1[i]; }
                else { minRight = Math.min(nums1[i], nums2[j]); }

                return (maxLeft + minRight) / 2.0;  // If the length of the combined array is even, the median is the average
            }
        }

        return 0.0;  // This line will never be reached
    }
}
