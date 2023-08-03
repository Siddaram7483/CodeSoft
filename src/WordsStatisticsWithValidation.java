import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class WordsStatisticsWithValidation {
        public static void main(String[] args) {
            String inputText = getInputTextFromUser();

            // Check if the input text is not empty
            if (!inputText.trim().isEmpty()) {
                // Split the input text into an array of words using spaces and punctuation as delimiters
                String[] words = inputText.split("[\\s,.!?]+");

                // Initialize a set of stop words (common words to ignore)
                Set<String> stopWords = new HashSet<>(Arrays.asList("this", "is", "a", "and", "one", "yes", "it"));

                // Initialize a map to store word frequencies
                Map<String, Integer> wordFrequencyMap = new HashMap<>();

                // Count the frequency of each word and ignore stop words
                for (String word : words) {
                    String lowerCaseWord = word.toLowerCase();
                    if (!stopWords.contains(lowerCaseWord)) {
                        wordFrequencyMap.put(lowerCaseWord, wordFrequencyMap.getOrDefault(lowerCaseWord, 0) + 1);
                    }
                }

                // Print the array of words
                System.out.println("Array of words:");
                System.out.println(Arrays.toString(words));

                // Print the number of unique words
                int uniqueWordsCount = wordFrequencyMap.size();
                System.out.println("Number of unique words: " + uniqueWordsCount);

                // Print the word frequencies
                System.out.println("Word frequencies:");
                for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            } else {
                System.out.println("No valid input provided.");
            }
        }

        private static String getInputTextFromUser() {
            // Create a Scanner to read user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your text (type 'done' on a new line to finish input):");
            StringBuilder inputText = new StringBuilder();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.trim().equalsIgnoreCase("done")) {
                    break;
                }
                inputText.append(line).append("\n");
            }

            // Close the scanner
            scanner.close();
            return inputText.toString();
        }
    }
