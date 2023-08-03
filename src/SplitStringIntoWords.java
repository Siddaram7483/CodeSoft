import java.util.Arrays;
public class SplitStringIntoWords {
        public static void main(String[] args) {
            String inputText = "Hello, this is a sample sentence! And another one? Yes, it is!";

            // Split the input text into an array of words using spaces and punctuation as delimiters
            String[] words = inputText.split("[\\s,.!?]+");

            // Print the array of words
            System.out.println("Array of words:");
            System.out.println(Arrays.toString(words));
        }
    }


