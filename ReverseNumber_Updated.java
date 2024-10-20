class Solution {
public:
    int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int last_digit = x % 10;  // Step 1: Get last digit
            x = x / 10;               // Step 2: Remove last digit
            
            // Step 3: Check for overflow before multiplying reversed by 10
            if (reversed > INT_MAX / 10 || (reversed == INT_MAX / 10 && last_digit > 7)) {
                return 0;  // Overflow case for positive numbers
            }
            if (reversed < INT_MIN / 10 || (reversed == INT_MIN / 10 && last_digit < -8)) {
                return 0;  // Overflow case for negative numbers
            }
            
            reversed = reversed * 10 + last_digit;  // Step 4: Accumulate reversed number
        }
        
        return reversed;  // Final step: Return the reversed number
    }
};
