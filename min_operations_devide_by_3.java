class Solution {
    public int minimumOperations(int[] nums) {
        int counter1 = 0;
        int counter2 = 0;
        for (int num : nums){
            if (num % 3 == 1){
                counter1++;
            }
            if (num % 3 == 2){
                counter2++;
            }}
        return counter1 + counter2;
                
            }

        }