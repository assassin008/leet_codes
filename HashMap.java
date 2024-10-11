import java.util.HashMap;
import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            if (frequencyMap.containsKey(currentChar)) {
                // If character is already in the HashMap, increment its count
                int currentCount = frequencyMap.get(currentChar);
                frequencyMap.put(currentChar, currentCount + 1);
            } else {
                // If character is not in the HashMap, add it with a count of 1
                frequencyMap.put(currentChar, 1);
            }
        }
        
        // Step 4: Find the first unique character
        int firstUniqueIndex = -1;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (frequencyMap.get(currentChar) == 1) {
                firstUniqueIndex = i;
                break;
            }
        }
        
        System.out.println("The index of the first unique character is: " + firstUniqueIndex);
    }
}
