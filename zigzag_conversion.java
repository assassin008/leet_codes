public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s; // Edge case: If numRows is 1, return the input string itself
        
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder(); // Initialize each row as an empty StringBuilder
        }
        int currentRow = 0; // Start from the first row
        boolean goingDown = false; // Initially, we're not going down the zigzag
        
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c); // Append the character to the current row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown; // Change direction when reaching the first or last row
            }
            currentRow += goingDown ? 1 : -1; // Update the current row index based on the direction
        }
        
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row); // Append each row to the result string
        }
        return result.toString(); // Return the resulting string
    }
}
