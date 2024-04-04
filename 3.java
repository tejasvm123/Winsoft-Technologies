import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {
    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();

            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        scanner.close();

        HashMap<String, Integer> wordCounts = countWords(inputString);

        System.out.println("Word counts:");
        for (String word : wordCounts.keySet()) {
            System.out.println("Word: " + word + ", Count: " + wordCounts.get(word));
        }
    }
}
