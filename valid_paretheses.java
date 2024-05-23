import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // Step 3: Initialize the stack
        
        for (int i = 0; i < s.length(); i++) { // Step 4: Iterate through each character
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') { // Step 5: Push opening brackets onto the stack
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') { // Step 6: Check closing brackets
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty(); // Step 8: Final check
    }
    
    // Step 7: Helper function to match brackets
    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}