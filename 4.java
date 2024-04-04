import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterFinder {

    public static void findDuplicateCharacters(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { 
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        boolean foundDuplicate = false;
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) { 
                System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        
        findDuplicateCharacters(inputString);
    }
}
