public class Solution {

    // Function to convert the string into a zigzag pattern
    public String convert(String s, int numRows) {
        // Edge case: If numRows is 1, no zigzagging needed, just return the original string
        if (numRows == 1) return s;
        
        // Create an array of StringBuilders, one for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Track the current row we are placing characters in
        int currentRow = 0;
        // Variable to track if we are moving down or up in the zigzag pattern
        boolean goingDown = false;

        // Loop through all characters in the input string
        for (char c : s.toCharArray()) {
            // Add the current character to the current row
            rows[currentRow].append(c);

            // If we are at the top or bottom row, reverse direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;  // Flip the direction
            }

            // Move to the next row
            currentRow += goingDown ? 1 : -1;
        }

        // Now, we need to concatenate all the rows together to form the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        // Return the final zigzagged string
        return result.toString();
    }
}
    