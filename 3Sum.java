import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for i


            int left = i+1;
            int right = nums.length-1;

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // Add triplet to result
                    
                    // Move both pointers after finding a valid triplet
                    left++;
                    right--;
                    
                    // Skip duplicates for the left and right pointers
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++; // Move left pointer right to increase sum
                } else {
                    right--; // Move right pointer left to decrease sum
            }

            }
        
            

        }
        return result;

        
    }
}