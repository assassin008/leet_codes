import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        // Iterate through the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current character
            int currentValue = romanValues.get(s.charAt(i));
            // If the next character is of greater value, subtract the current value
            if (i < s.length() - 1 && romanValues.get(s.charAt(i + 1)) > currentValue) {
                result -= currentValue;
            } else {
                // Otherwise, add the current value
                result += currentValue;
            }
        }

        // Return the final result
        return result;
    }
}
