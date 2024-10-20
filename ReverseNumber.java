class Solution {
public:
    int reverse(int x) {
        int reversed = 0;
        while (x!=0){
            int last_digit = x % 10;
            x = x / 10;

            reversed = reversed * 10 + last_digit;



        }
        return reversed;
        
    }
};