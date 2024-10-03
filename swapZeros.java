class Solution {
    public void moveZeroes(int[] nums) {
        boolean swapped = true;

        while (swapped == true) {
            swapped = false;
            for (int i = 0;i< nums.length - 1; i++){
                if (nums[i] == 0 && nums[i+1]!=0){
                    int a = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1]= a;
                    swapped = true;
                }
                

            }

        }
        
    }
}