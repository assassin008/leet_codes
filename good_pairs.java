class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0; // to count the number of good pairs
        for (int i = 0; i < nums.length; i++) { // outer loop
            for (int j = i + 1; j < nums.length; j++) { // inner loop
                if (nums[i] == nums[j]) { // check if the pair is good
                    count++; // increment the count if it's a good pair
                }
            }
        }
        return count; // return the total number of good pairs
    }
}
