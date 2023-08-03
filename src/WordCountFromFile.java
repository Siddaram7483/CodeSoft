import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WordCountFromFile {
        public static void main(String[] args) {
            // Prompt the user to enter text
            System.out.println("Enter your text (type 'done' on a new line to finish input):");
            Scanner scanner = new Scanner(System.in);
            StringBuilder inputText = new StringBuilder();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.trim().equalsIgnoreCase("done")) {
                    break;
                }
                inputText.append(line).append("\n");
            }

            // Create a new file to store the user's input
            File outputFile = new File("user_text.txt");
            try {
                FileWriter fileWriter = new FileWriter(outputFile);
                fileWriter.write(inputText.toString());
                fileWriter.close();
                System.out.println("Text successfully saved to 'user_text.txt'.");
            } catch (IOException e) {
                System.out.println("Error occurred while writing to the file.");
                e.printStackTrace();
            }

            // Count words in the file
            int wordCount = 0;
            try {
                Scanner fileScanner = new Scanner(outputFile);
                while (fileScanner.hasNext()) {
                    fileScanner.next();
                    wordCount++;
                }
                fileScanner.close();
                System.out.println("Number of words in the file: " + wordCount);
            } catch (IOException e) {
                System.out.println("Error occurred while reading from the file.");
                e.printStackTrace();
            }

            // Close the scanner
            scanner.close();
        }
    }


