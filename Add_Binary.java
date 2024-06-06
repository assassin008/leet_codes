class Solution {
    public String addBinary(String a, String b) {
        // Step 1: Initialize variables
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        // Step 2: Initialize StringBuilder and loop
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            // Step 3: Calculate the sum of the current digits and carry
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }
            
            // Step 4: Append the current digit to the result
            result.append(sum % 2);
            
            // Step 5: Update the carry
            carry = sum / 2;
        }
        
        // Step 6: Reverse the result to get the final binary sum
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addBinary("11", "1")); // Expected output: "100"
        System.out.println(sol.addBinary("1010", "1011")); // Expected output: "10101"
    }
}
