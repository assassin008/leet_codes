public class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;  // Quick return for 0

        int low = 1;
        int high = x;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= x / mid) {
                // mid*mid <= x
                result = mid;  // mid is a potential result
                low = mid + 1; // try to find a larger value
            } else {
                // mid*mid > x
                high = mid - 1; // try to find a smaller value
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        System.out.println(solution.mySqrt(4));  // Output: 2
        System.out.println(solution.mySqrt(8));  // Output: 2
        System.out.println(solution.mySqrt(0));  // Output: 0
        System.out.println(solution.mySqrt(1));  // Output: 1
        System.out.println(solution.mySqrt(16)); // Output: 4
    }
}
