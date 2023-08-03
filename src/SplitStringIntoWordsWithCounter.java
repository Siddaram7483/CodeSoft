import java.util.Arrays;
public class SplitStringIntoWordsWithCounter {
        public static void main(String[] args) {
            String inputText = "Hello, this is a sample sentence! And another one? Yes, it is!";

            // Split the input text into an array of words using spaces and punctuation as delimiters
            String[] words = inputText.split("[\\s,.!?]+");

            // Initialize a counter variable to keep track of the number of words
            int wordCount = words.length;

            // Print the array of words
            System.out.println("Array of words:");
            System.out.println(Arrays.toString(words));

            // Print the number of words
            System.out.println("Number of words: " + wordCount);
        }
    }


