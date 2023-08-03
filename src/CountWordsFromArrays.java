import java.util.Arrays;
public class CountWordsFromArrays {
        public static void main(String[] args) {
            String inputText = "Hello, this is a sample sentence! And another one? Yes, it is!";

            // Split the input text into an array of words using spaces and punctuation as delimiters
            String[] words = inputText.split("[\\s,.!?]+");

            // Initialize a counter variable to keep track of the number of words
            int wordCount = 0;

            // Iterate through the array of words and increment the counter for each word encountered
            for (String word : words) {
                wordCount++;
            }

            // Print the array of words
            System.out.println("Array of words:");
            System.out.println(Arrays.toString(words));

            // Print the total count of words to the user
            System.out.println("Total number of words: " + wordCount);
        }
    }


