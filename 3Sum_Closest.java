class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int secondPointer = i + 1;
            int thirdPointer = nums.length - 1;

            while (secondPointer < thirdPointer) {
                int currentSum = nums[i] + nums[secondPointer] + nums[thirdPointer];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    secondPointer++;
                } else if (currentSum > target) {
                    thirdPointer--;
                } else {
                    return currentSum;
                }
            }
        }

        return closestSum;
    }

    
}