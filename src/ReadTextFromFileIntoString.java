import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadTextFromFileIntoString {
        public static void main(String[] args) {
            // Specify the path to the file
            String filePath = "path_to_your_file.txt";

            // Read the text from the file and store it in a string variable
            String fileText = readTextFromFile(filePath);

            System.out.println("File text:");
            System.out.println(fileText);
        }

        private static String readTextFromFile(String filePath) {
            StringBuilder fileText = new StringBuilder();
            try {
                File file = new File(filePath);
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    fileText.append(scanner.nextLine()).append("\n");
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + filePath);
                e.printStackTrace();
            }

            return fileText.toString();
        }
    }


