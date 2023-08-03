import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class CountWordsWithoutStopWOrds {
        public static void main(String[] args) {
            String inputText = "Hello, this is a sample sentence! And another one? Yes, it is!";

            // Split the input text into an array of words using spaces and punctuation as delimiters
            String[] words = inputText.split("[\\s,.!?]+");

            // Initialize a set of stop words (common words to ignore)
            Set<String> stopWords = new HashSet<>(Arrays.asList("this", "is", "a", "and", "one", "yes", "it"));

            // Initialize a counter variable to keep track of the number of words
            int wordCount = 0;

            // Iterate through the array of words and increment the counter for each non-stop word encountered
            for (String word : words) {
                if (!stopWords.contains(word.toLowerCase())) {
                    wordCount++;
                }
            }

            // Print the array of words
            System.out.println("Array of words:");
            System.out.println(Arrays.toString(words));

            // Print the total count of non-stop words to the user
            System.out.println("Total number of non-stop words: " + wordCount);
        }
    }


